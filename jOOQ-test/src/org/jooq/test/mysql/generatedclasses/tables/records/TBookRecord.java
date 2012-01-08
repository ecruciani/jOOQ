/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -969400789;

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.ID, value);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.ID);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.mysql.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.mysql.generatedclasses.tables.TBookToBookStore.BOOK_ID.equal(getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.ID)))
			.fetch();
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.AUTHOR_ID]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.AUTHOR_ID]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.AUTHOR_ID);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.AUTHOR_ID]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.mysql.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.mysql.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.co_author_id]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.co_author_id]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.co_author_id]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.mysql.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.mysql.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Some more details about the book
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.DETAILS_ID, value);
	}

	/**
	 * Some more details about the book
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.DETAILS_ID);
	}

	/**
	 * The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.TITLE);
	}

	/**
	 * The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.PUBLISHED_IN, value);
	}

	/**
	 * The year the book was published in
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.PUBLISHED_IN);
	}

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.LANGUAGE_ID]
	 * REFERENCES t_language [test.t_language.ID]
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.mysql.generatedclasses.enums.TLanguage value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.LANGUAGE_ID, value);
	}

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.LANGUAGE_ID]
	 * REFERENCES t_language [test.t_language.ID]
	 * </pre></code>
	 */
	public org.jooq.test.mysql.generatedclasses.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.LANGUAGE_ID);
	}

	/**
	 * Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.CONTENT_TEXT, value);
	}

	/**
	 * Some textual content of the book
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.CONTENT_TEXT);
	}

	/**
	 * Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.CONTENT_PDF, value);
	}

	/**
	 * Some binary content of the book
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.CONTENT_PDF);
	}

	/**
	 * The book's stock status
	 */
	public void setStatus(org.jooq.test.mysql.generatedclasses.enums.TBookStatus value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TBook.STATUS, value);
	}

	/**
	 * The book's stock status
	 */
	public org.jooq.test.mysql.generatedclasses.enums.TBookStatus getStatus() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TBook.STATUS);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.mysql.generatedclasses.tables.TBook.T_BOOK);
	}
}
