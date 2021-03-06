/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * snapshot table for snapshot TEST.M_LIBRARY
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "M_LIBRARY", schema = "TEST")
public class M_LIBRARY extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.M_LIBRARY> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record2<java.lang.String, java.lang.String>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.M_LIBRARY_INTERFACE {

	private static final long serialVersionUID = -825342060;

	/**
	 * Setter for <code>TEST.M_LIBRARY.AUTHOR</code>. 
	 */
	@Override
	public void setAUTHOR(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY.M_LIBRARY.AUTHOR, value);
	}

	/**
	 * Getter for <code>TEST.M_LIBRARY.AUTHOR</code>. 
	 */
	@javax.persistence.Column(name = "AUTHOR", length = 101)
	@Override
	public java.lang.String getAUTHOR() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY.M_LIBRARY.AUTHOR);
	}

	/**
	 * Setter for <code>TEST.M_LIBRARY.TITLE</code>. 
	 */
	@Override
	public void setTITLE(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY.M_LIBRARY.TITLE, value);
	}

	/**
	 * Getter for <code>TEST.M_LIBRARY.TITLE</code>. 
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@Override
	public java.lang.String getTITLE() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY.M_LIBRARY.TITLE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY.M_LIBRARY.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY.M_LIBRARY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAUTHOR();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTITLE();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.M_LIBRARY_INTERFACE from) {
		setAUTHOR(from.getAUTHOR());
		setTITLE(from.getTITLE());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.M_LIBRARY_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached M_LIBRARY
	 */
	public M_LIBRARY() {
		super(org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY.M_LIBRARY);
	}
}
