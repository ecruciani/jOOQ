/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = 383917817;

	/**
	 * The singleton instance of t_identity
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.postgres.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		super("t_identity", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private TIdentity(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TIdentity.T_IDENTITY);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.postgres.generatedclasses.Keys.IDENTITY_t_identity;
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TIdentity as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TIdentity(alias);
	}
}
