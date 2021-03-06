/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class AddressRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.AddressRecord> implements org.jooq.Record8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 896363111;

	/**
	 * Setter for <code>sakila.address.address_id</code>. 
	 */
	public void setAddressId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID, value);
	}

	/**
	 * Getter for <code>sakila.address.address_id</code>. 
	 */
	public java.lang.Short getAddressId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID);
	}

	/**
	 * Setter for <code>sakila.address.address</code>. 
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_, value);
	}

	/**
	 * Getter for <code>sakila.address.address</code>. 
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_);
	}

	/**
	 * Setter for <code>sakila.address.address2</code>. 
	 */
	public void setAddress2(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS2, value);
	}

	/**
	 * Getter for <code>sakila.address.address2</code>. 
	 */
	public java.lang.String getAddress2() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS2);
	}

	/**
	 * Setter for <code>sakila.address.district</code>. 
	 */
	public void setDistrict(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.DISTRICT, value);
	}

	/**
	 * Getter for <code>sakila.address.district</code>. 
	 */
	public java.lang.String getDistrict() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.DISTRICT);
	}

	/**
	 * Setter for <code>sakila.address.city_id</code>. 
	 */
	public void setCityId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.examples.mysql.sakila.tables.records.CityRecord}
	 */
	public void setCityId(org.jooq.examples.mysql.sakila.tables.records.CityRecord value) {
		if (value == null) {
			setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID, null);
		}
		else {
			setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID, value.getValue(org.jooq.examples.mysql.sakila.tables.City.CITY.CITY_ID));
		}
	}

	/**
	 * Getter for <code>sakila.address.city_id</code>. 
	 */
	public java.lang.Short getCityId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID);
	}

	/**
	 * Setter for <code>sakila.address.postal_code</code>. 
	 */
	public void setPostalCode(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.POSTAL_CODE, value);
	}

	/**
	 * Getter for <code>sakila.address.postal_code</code>. 
	 */
	public java.lang.String getPostalCode() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.POSTAL_CODE);
	}

	/**
	 * Setter for <code>sakila.address.phone</code>. 
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.PHONE, value);
	}

	/**
	 * Getter for <code>sakila.address.phone</code>. 
	 */
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.PHONE);
	}

	/**
	 * Setter for <code>sakila.address.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.LAST_UPDATE, value);
	}

	/**
	 * Getter for <code>sakila.address.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.LAST_UPDATE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>sakila.customer</code> referencing this <code>sakila.address</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> fetchCustomerList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER)
			.where(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID)))
			.fetch();
	}

	/**
	 * Fetch a list of <code>sakila.staff</code> referencing this <code>sakila.address</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.StaffRecord> fetchStaffList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Staff.STAFF)
			.where(org.jooq.examples.mysql.sakila.tables.Staff.STAFF.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID)))
			.fetch();
	}

	/**
	 * Fetch a list of <code>sakila.store</code> referencing this <code>sakila.address</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> fetchStoreList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Store.STORE)
			.where(org.jooq.examples.mysql.sakila.tables.Store.STORE.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID)))
			.fetch();
	}

	/**
	 * Fetch a <code>sakila.city</code> referenced by this <code>sakila.address</code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.CityRecord fetchCity() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.City.CITY)
			.where(org.jooq.examples.mysql.sakila.tables.City.CITY.CITY_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Short> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.DISTRICT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field5() {
		return org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.POSTAL_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAddress2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDistrict();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value5() {
		return getCityId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getPostalCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressRecord
	 */
	public AddressRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS);
	}
}
