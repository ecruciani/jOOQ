/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class TArrays extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = 1746769367;

	/**
	 * The singleton instance of t_arrays
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TArrays T_ARRAYS = new org.jooq.test.postgres.generatedclasses.tables.TArrays();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer>("id", org.jooq.impl.SQLDataType.INTEGER, T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.String[]> STRING_ARRAY = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.String[]>("string_array", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer[]> NUMBER_ARRAY = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer[]>("number_array", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.sql.Date[]> DATE_ARRAY = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.sql.Date[]>("date_array", org.jooq.impl.SQLDataType.DATE.getArrayDataType(), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[]> UDT_ARRAY = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[]>("udt_array", org.jooq.test.postgres.generatedclasses.udt.UStreetType.U_STREET_TYPE.getDataType().getArrayDataType(), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, org.jooq.test.postgres.generatedclasses.enums.UCountry[]> ENUM_ARRAY = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, org.jooq.test.postgres.generatedclasses.enums.UCountry[]>("enum_array", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.UCountry.class).getArrayDataType(), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer[]> ARRAY_ARRAY = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer[]>("array_array", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), T_ARRAYS);

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super("t_arrays", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.pk_t_arrays;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.pk_t_arrays);
	}
}
