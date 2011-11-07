/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class XUnusedRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -343748194;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record> fetchXTestCase_85List() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85)
			.where(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_UNUSED_ID.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID)))
			.and(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord> fetchXUnusedList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID_REF.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID)))
			.and(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME_REF.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record> fetchXTestCase_64_69List() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.UNUSED_ID.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.BIG_INTEGER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.BIG_INTEGER);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_unused.id_ref, dbo.x_unused.name_ref]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public void setIdRef(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID_REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_unused.id_ref, dbo.x_unused.name_ref]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public java.lang.Integer getIdRef() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID_REF);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_unused.id_ref, dbo.x_unused.name_ref]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord fetchXUnused() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.ID_REF)))
			.and(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME_REF)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.CLASS, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.CLASS);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setFields_(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.FIELDS, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public java.lang.Integer getFields_() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.FIELDS);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.CONFIGURATION, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public java.lang.Integer getConfiguration_() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.CONFIGURATION);
	}

	/**
	 * An uncommented item
	 */
	public void setUDT(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.U_D_T, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getUDT() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.U_D_T);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setMetaData_(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.META_DATA, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public java.lang.Integer getMetaData_() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.META_DATA);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setType0_(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.TYPE0, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public java.lang.Integer getType0_() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.TYPE0);
	}

	/**
	 * An uncommented item
	 */
	public void setPrimaryKey(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.PRIMARY_KEY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPrimaryKey() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.PRIMARY_KEY);
	}

	/**
	 * An uncommented item
	 */
	public void setPrimarykey(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.PRIMARYKEY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPrimarykey() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.PRIMARYKEY);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_unused.id_ref, dbo.x_unused.name_ref]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public void setNameRef(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME_REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_unused.id_ref, dbo.x_unused.name_ref]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public java.lang.String getNameRef() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.NAME_REF);
	}

	/**
	 * An uncommented item
	 */
	public void setField_737(java.math.BigDecimal value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.FIELD_737, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getField_737() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.FIELD_737);
	}

	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED);
	}

	/**
	 * Create an attached XUnusedRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public XUnusedRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED, configuration);
	}
}
