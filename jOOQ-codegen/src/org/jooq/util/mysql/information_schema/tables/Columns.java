/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.MySQLDataType;
import org.jooq.util.mysql.information_schema.InformationSchema;
import org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Columns extends TableImpl<ColumnsRecord> {

	private static final long serialVersionUID = 1262349755;

	/**
	 * The singleton instance of COLUMNS
	 */
	public static final Columns COLUMNS = new Columns();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ColumnsRecord> __RECORD_TYPE = ColumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ColumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_CATALOG = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "TABLE_CATALOG", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_SCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "TABLE_SCHEMA", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "TABLE_NAME", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_NAME", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Long> ORDINAL_POSITION = new TableFieldImpl<ColumnsRecord, Long>(SQLDialect.MYSQL, "ORDINAL_POSITION", MySQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_DEFAULT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_DEFAULT", MySQLDataType.LONGTEXT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> IS_NULLABLE = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "IS_NULLABLE", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> DATA_TYPE = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "DATA_TYPE", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Long> CHARACTER_MAXIMUM_LENGTH = new TableFieldImpl<ColumnsRecord, Long>(SQLDialect.MYSQL, "CHARACTER_MAXIMUM_LENGTH", MySQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Long> CHARACTER_OCTET_LENGTH = new TableFieldImpl<ColumnsRecord, Long>(SQLDialect.MYSQL, "CHARACTER_OCTET_LENGTH", MySQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Long> NUMERIC_PRECISION = new TableFieldImpl<ColumnsRecord, Long>(SQLDialect.MYSQL, "NUMERIC_PRECISION", MySQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Long> NUMERIC_SCALE = new TableFieldImpl<ColumnsRecord, Long>(SQLDialect.MYSQL, "NUMERIC_SCALE", MySQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "CHARACTER_SET_NAME", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLLATION_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLLATION_NAME", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_TYPE = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_TYPE", MySQLDataType.LONGTEXT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_KEY = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_KEY", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> EXTRA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "EXTRA", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> PRIVILEGES = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "PRIVILEGES", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_COMMENT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_COMMENT", MySQLDataType.VARCHAR, COLUMNS);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super(SQLDialect.MYSQL, "COLUMNS", InformationSchema.INFORMATION_SCHEMA);
	}
}
