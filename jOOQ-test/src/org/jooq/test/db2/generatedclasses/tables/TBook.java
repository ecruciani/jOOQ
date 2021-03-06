/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 2066051912;

	/**
	 * The singleton instance of <code>LUKAS.T_BOOK</code>
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.db2.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>LUKAS.T_BOOK.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>LUKAS.T_BOOK.AUTHOR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>LUKAS.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>LUKAS.T_BOOK.DETAILS_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>LUKAS.T_BOOK.TITLE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400), T_BOOK);

	/**
	 * The column <code>LUKAS.T_BOOK.PUBLISHED_IN</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>LUKAS.T_BOOK.LANGUAGE_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>LUKAS.T_BOOK.CONTENT_TEXT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.LONGVARCHAR.length(32700), T_BOOK);

	/**
	 * The column <code>LUKAS.T_BOOK.CONTENT_PDF</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB.length(1048576), T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_BOOK__PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.T_BOOK__PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.db2.generatedclasses.Keys.T_BOOK__FK_T_BOOK_AUTHOR_ID, org.jooq.test.db2.generatedclasses.Keys.T_BOOK__FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.db2.generatedclasses.Keys.T_BOOK__FK_T_BOOK_LANGUAGE_ID);
	}
}
