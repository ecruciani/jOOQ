/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -1683387177;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_TEST_CASE_85.X_UNUSED_ID, PUBLIC.X_TEST_CASE_85.X_UNUSED_ID, PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME, PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_TEST_CASE_85.X_UNUSED_ID, PUBLIC.X_TEST_CASE_85.X_UNUSED_ID, PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME, PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_TEST_CASE_85.X_UNUSED_ID, PUBLIC.X_TEST_CASE_85.X_UNUSED_ID, PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME, PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_TEST_CASE_85.X_UNUSED_ID, PUBLIC.X_TEST_CASE_85.X_UNUSED_ID, PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME, PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
	}

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}

	/**
	 * Create an attached XTestCase_85Record
	 */
	public XTestCase_85Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, configuration);
	}
}