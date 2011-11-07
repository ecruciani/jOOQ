/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Information about accessible columns in constraint definitions
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class AllConsColumns extends org.jooq.impl.TableImpl<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord> {

	private static final long serialVersionUID = 855207468;

	/**
	 * The singleton instance of ALL_CONS_COLUMNS
	 */
	public static final org.jooq.util.oracle.sys.tables.AllConsColumns ALL_CONS_COLUMNS = new org.jooq.util.oracle.sys.tables.AllConsColumns();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord> __RECORD_TYPE = org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * Owner of the constraint definition
	 */
	public static final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.lang.String> OWNER = new org.jooq.impl.TableFieldImpl<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.lang.String>("OWNER", org.jooq.impl.SQLDataType.VARCHAR, ALL_CONS_COLUMNS);

	/**
	 * Name associated with the constraint definition
	 */
	public static final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.lang.String> CONSTRAINT_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.lang.String>("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, ALL_CONS_COLUMNS);

	/**
	 * Name associated with table with constraint definition
	 */
	public static final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.lang.String> TABLE_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.lang.String>("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, ALL_CONS_COLUMNS);

	/**
	 * Name associated with column or attribute of object column specified in the constraint definition
	 */
	public static final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.lang.String> COLUMN_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.lang.String>("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, ALL_CONS_COLUMNS);

	/**
	 * Original position of column or attribute in definition
	 */
	public static final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.math.BigDecimal> POSITION = new org.jooq.impl.TableFieldImpl<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord, java.math.BigDecimal>("POSITION", org.jooq.impl.SQLDataType.NUMERIC, ALL_CONS_COLUMNS);

	/**
	 * No further instances allowed
	 */
	private AllConsColumns() {
		super("ALL_CONS_COLUMNS", org.jooq.util.oracle.sys.Sys.SYS);
	}
}
