/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class TableConstraints extends org.jooq.impl.TableImpl<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord> {

	private static final long serialVersionUID = -837141244;

	/**
	 * The singleton instance of table_constraints
	 */
	public static final org.jooq.util.postgres.information_schema.tables.TableConstraints TABLE_CONSTRAINTS = new org.jooq.util.postgres.information_schema.tables.TableConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord> __RECORD_TYPE = org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_TYPE = createField("constraint_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> IS_DEFERRABLE = createField("is_deferrable", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord, java.lang.String> INITIALLY_DEFERRED = createField("initially_deferred", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private TableConstraints() {
		super("table_constraints", org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * No further instances allowed
	 */
	private TableConstraints(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.postgres.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS);
	}

	@Override
	public org.jooq.util.postgres.information_schema.tables.TableConstraints as(java.lang.String alias) {
		return new org.jooq.util.postgres.information_schema.tables.TableConstraints(alias);
	}
}
