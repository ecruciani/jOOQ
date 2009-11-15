/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import java.sql.Timestamp;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;


/**
 * This class is generated by jOOQ.
 *
 * Table privileges
 */
public class TablesPriv extends TableImpl {

	private static final long serialVersionUID = -8929007369296473219L;

	/**
	 * The singleton instance of tables_priv
	 */
	public static final TablesPriv TABLES_PRIV = new TablesPriv();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> HOST = new TableFieldImpl<String>("Host", String.class, TABLES_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DB = new TableFieldImpl<String>("Db", String.class, TABLES_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> USER = new TableFieldImpl<String>("User", String.class, TABLES_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_NAME = new TableFieldImpl<String>("Table_name", String.class, TABLES_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> GRANTOR = new TableFieldImpl<String>("Grantor", String.class, TABLES_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> TIMESTAMP = new TableFieldImpl<Timestamp>("Timestamp", Timestamp.class, TABLES_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_PRIV = new TableFieldImpl<String>("Table_priv", String.class, TABLES_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLUMN_PRIV = new TableFieldImpl<String>("Column_priv", String.class, TABLES_PRIV);

	/**
	 * No further instances allowed
	 */
	private TablesPriv() {
		super("tables_priv", Mysql.MYSQL);
	}
}
