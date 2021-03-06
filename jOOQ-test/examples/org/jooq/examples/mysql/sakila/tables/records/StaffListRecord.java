/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class StaffListRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord> implements org.jooq.Record8<java.lang.Byte, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte> {

	private static final long serialVersionUID = 1733656814;

	/**
	 * Setter for <code>sakila.staff_list.ID</code>. 
	 */
	public void setId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ID, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.ID</code>. 
	 */
	public java.lang.Byte getId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ID);
	}

	/**
	 * Setter for <code>sakila.staff_list.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.NAME, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.name</code>. 
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.NAME);
	}

	/**
	 * Setter for <code>sakila.staff_list.address</code>. 
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ADDRESS, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.address</code>. 
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ADDRESS);
	}

	/**
	 * Setter for <code>sakila.staff_list.zip code</code>. 
	 */
	public void setZipCode(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ZIP_CODE, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.zip code</code>. 
	 */
	public java.lang.String getZipCode() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ZIP_CODE);
	}

	/**
	 * Setter for <code>sakila.staff_list.phone</code>. 
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.PHONE, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.phone</code>. 
	 */
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.PHONE);
	}

	/**
	 * Setter for <code>sakila.staff_list.city</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.CITY, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.city</code>. 
	 */
	public java.lang.String getCity() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.CITY);
	}

	/**
	 * Setter for <code>sakila.staff_list.country</code>. 
	 */
	public void setCountry(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.COUNTRY, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.country</code>. 
	 */
	public java.lang.String getCountry() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.COUNTRY);
	}

	/**
	 * Setter for <code>sakila.staff_list.SID</code>. 
	 */
	public void setSid(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.SID, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.SID</code>. 
	 */
	public java.lang.Byte getSid() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.SID);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Byte, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Byte, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field1() {
		return org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ZIP_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field8() {
		return org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.SID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getZipCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value8() {
		return getSid();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StaffListRecord
	 */
	public StaffListRecord() {
		super(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST);
	}
}
