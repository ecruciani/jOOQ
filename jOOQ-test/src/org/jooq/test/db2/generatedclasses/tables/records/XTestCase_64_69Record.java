/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -71557577;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.db2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID.equal(getValueAsShort(org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.X_TEST_CASE_64_69.UNUSED_ID]
	 * REFERENCES X_UNUSED [LUKAS.X_UNUSED.ID]
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.X_TEST_CASE_64_69.UNUSED_ID]
	 * REFERENCES X_UNUSED [LUKAS.X_UNUSED.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.X_TEST_CASE_64_69.UNUSED_ID]
	 * REFERENCES X_UNUSED [LUKAS.X_UNUSED.ID]
	 * </pre></code>
	 */
	public org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord fetchXUnused() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.db2.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * Create an attached XTestCase_64_69Record
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public XTestCase_64_69Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, configuration);
	}
}
