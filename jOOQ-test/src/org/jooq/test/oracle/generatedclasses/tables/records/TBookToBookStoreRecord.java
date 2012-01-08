/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = 1374252568;

	/**
	 * The book store name
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [TEST.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value);
	}

	/**
	 * The book store name
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [TEST.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
	}

	/**
	 * The book store name
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [TEST.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.oracle.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME.equal(getValue(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [TEST.T_BOOK.ID]
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, value);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [TEST.T_BOOK.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [TEST.T_BOOK.ID]
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.oracle.generatedclasses.tables.TBook.T_BOOK.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * The number of books on stock
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK, value);
	}

	/**
	 * The number of books on stock
	 */
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
