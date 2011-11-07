/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class FilmTextRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> {

	private static final long serialVersionUID = -462348424;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getFilmId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmText.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmText.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmText.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmText.DESCRIPTION);
	}

	/**
	 * Create a detached FilmTextRecord
	 */
	public FilmTextRecord() {
		super(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT);
	}

	/**
	 * Create an attached FilmTextRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public FilmTextRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT, configuration);
	}
}
