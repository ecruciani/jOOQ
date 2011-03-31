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
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lukas Eder
 */
public abstract class AbstractFunctionDefinition extends AbstractCallableDefinition implements FunctionDefinition {

    protected ColumnDefinition       returnValue;
    protected List<ColumnDefinition> inParameters;

    public AbstractFunctionDefinition(Database database, PackageDefinition pkg, String name, String comment, String overload) {
        super(database, pkg, name, comment, overload);
    }

    @Override
    public String getDefaultSubPackage() {
        return "functions";
    }

    @Override
    public final DataTypeDefinition getReturnType() throws SQLException {
        return getReturnValue().getType();
    }


    @Override
    public final ColumnDefinition getReturnValue() throws SQLException {
        if (returnValue == null) {
            init();
        }

        return returnValue;
    }

    @Override
    public final List<ColumnDefinition> getInParameters() throws SQLException {
        if (inParameters == null) {
            init();
        }

        return inParameters;
    }

    private final void init() throws SQLException {
        inParameters = new ArrayList<ColumnDefinition>();
        init0();
    }

    protected abstract void init0() throws SQLException;
}
