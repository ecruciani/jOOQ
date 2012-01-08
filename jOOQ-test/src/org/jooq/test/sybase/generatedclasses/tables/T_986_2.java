/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_986_2 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record> {

	private static final long serialVersionUID = -160668499;

	/**
	 * The singleton instance of t_986_2
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.T_986_2 T_986_2 = new org.jooq.test.sybase.generatedclasses.tables.T_986_2();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_986_2.REF]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record, java.lang.Integer> REF = createField("REF", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private T_986_2() {
		super("t_986_2", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * No further instances allowed
	 */
	private T_986_2(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.T_986_2.T_986_2);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.t_986_2__pk_986;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record>>asList(org.jooq.test.sybase.generatedclasses.Keys.t_986_2__pk_986, org.jooq.test.sybase.generatedclasses.Keys.t_986_2__uk_986);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record, ?>>asList(org.jooq.test.sybase.generatedclasses.Keys.t_986_2__fk_986);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.T_986_2 as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.T_986_2(alias);
	}
}
