/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class Addresstype extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord> {

	private static final long serialVersionUID = 1481421277;

	/**
	 * The singleton instance of AddressType
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.Addresstype ADDRESSTYPE = new org.jooq.examples.sqlserver.adventureworks.person.tables.Addresstype();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord, java.lang.Integer> ADDRESSTYPEID = createField("AddressTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Addresstype() {
		super("AddressType", org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON);
	}

	/**
	 * No further instances allowed
	 */
	private Addresstype(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON, org.jooq.examples.sqlserver.adventureworks.person.tables.Addresstype.ADDRESSTYPE);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_ADDRESSTYPE;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_ADDRESSTYPE_ADDRESSTYPEID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_ADDRESSTYPE_ADDRESSTYPEID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.Addresstype as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.Addresstype(alias);
	}
}