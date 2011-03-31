/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.util;

import java.sql.SQLException;
import java.util.List;

import org.jooq.impl.JooqLogger;
import org.jooq.impl.StringUtils;

/**
 * A base implementation for column definitions.
 *
 * @author Lukas Eder
 */
public class DefaultColumnDefinition extends AbstractDefinition implements ColumnDefinition {

    private static final JooqLogger   log = JooqLogger.getLogger(DefaultColumnDefinition.class);

    private final String              table;
    private final int                 position;
    private final DataTypeDefinition  underlying;

    private DataTypeDefinition        type;
    private boolean                   primaryKeyLoaded;
    private UniqueKeyDefinition       primaryKey;
    private List<UniqueKeyDefinition> uniqueKeys;
    private boolean                   foreignKeyLoaded;
    private ForeignKeyDefinition      foreignKey;

    public DefaultColumnDefinition(Database database, String table, String name, int position, DataTypeDefinition type,
        String comment) {

        super(database, protectName(table, name, position), comment);

        this.table = table;
        this.position = position;
        this.underlying = type;
    }

    private static String protectName(String table, String name, int position) {
        if (name == null) {
            log.warn("Missing name", "Object " + table + " holds a column without a name at position " + position);
            return "_" + position;
        }

        return name;
    }

    @Override
    public final int getPosition() {
        return position;
    }

    @Override
    public final String getTableName() {
        return table;
    }

    @Override
    public final DataTypeDefinition getType() throws SQLException {

        // Lazy initialise
        if (type == null) {
            ForeignKeyDefinition fk = getDatabase().getRelations().getForeignKey(this);

            // If this is a foreign key to a master data type
            if (fk != null) {
                TableDefinition referencedTable = fk.getReferencedTable();

                if (referencedTable instanceof MasterDataTableDefinition) {
                    type = new MasterDataTypeDefinition(referencedTable, underlying);
                }
            }

            // Else...
            if (type == null) {
                type = underlying;
            }
        }

        return type;
    }

    @Override
    public final String getQualifiedName() {
        if (StringUtils.isBlank(getSchemaName())) {
            return getTableName() + "." + getName();
        }
        else {
            return getSchemaName() + "." + getTableName() + "." + getName();
        }
    }

    @Override
    public final UniqueKeyDefinition getPrimaryKey() throws SQLException {
        if (!primaryKeyLoaded) {
            primaryKeyLoaded = true;
            primaryKey = getDatabase().getRelations().getPrimaryKey(this);
        }

        return primaryKey;
    }

    @Override
    public List<UniqueKeyDefinition> getUniqueKeys() throws SQLException {
        if (uniqueKeys == null) {
            uniqueKeys = getDatabase().getRelations().getUniqueKeys(this);
        }

        return uniqueKeys;
    }

    @Override
    public final ForeignKeyDefinition getForeignKey() throws SQLException {
        if (!foreignKeyLoaded) {
            foreignKeyLoaded = true;
            foreignKey = getDatabase().getRelations().getForeignKey(this);
        }

        return foreignKey;
    }

    @Override
    public String getSubPackage() {
        return "";
    }
}
