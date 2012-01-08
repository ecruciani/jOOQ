/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class Systables extends org.jooq.impl.TableImpl<org.jooq.util.derby.sys.tables.records.SystablesRecord> {

	private static final long serialVersionUID = 1357425667;

	/**
	 * The singleton instance of SYSTABLES
	 */
	public static final org.jooq.util.derby.sys.tables.Systables SYSTABLES = new org.jooq.util.derby.sys.tables.Systables();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.derby.sys.tables.records.SystablesRecord> __RECORD_TYPE = org.jooq.util.derby.sys.tables.records.SystablesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.derby.sys.tables.records.SystablesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SystablesRecord, java.lang.String> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.CHAR, SYSTABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SystablesRecord, java.lang.String> TABLENAME = createField("TABLENAME", org.jooq.impl.SQLDataType.VARCHAR, SYSTABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SystablesRecord, java.lang.String> TABLETYPE = createField("TABLETYPE", org.jooq.impl.SQLDataType.CHAR, SYSTABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SystablesRecord, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSTABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SystablesRecord, java.lang.String> LOCKGRANULARITY = createField("LOCKGRANULARITY", org.jooq.impl.SQLDataType.CHAR, SYSTABLES);

	/**
	 * No further instances allowed
	 */
	private Systables() {
		super("SYSTABLES", org.jooq.util.derby.sys.Sys.SYS);
	}
}
