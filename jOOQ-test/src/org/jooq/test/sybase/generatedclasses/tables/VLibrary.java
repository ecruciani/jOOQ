/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 1492663498;

	/**
	 * The singleton instance of V_LIBRARY
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.sybase.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("V_LIBRARY", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * No further instances allowed
	 */
	private VLibrary(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.VLibrary(alias);
	}
}
