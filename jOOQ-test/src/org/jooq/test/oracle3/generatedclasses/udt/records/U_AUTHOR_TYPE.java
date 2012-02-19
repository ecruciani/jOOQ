/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class U_AUTHOR_TYPE extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> {

	private static final long serialVersionUID = -893216533;


	/**
	 * An uncommented item
	 */
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setFIRST_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFIRST_NAME() {
		return getValue(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLAST_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLAST_NAME() {
		return getValue(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.LAST_NAME);
	}

	/**
	 * Call TEST.U_AUTHOR_TYPE.COUNT_BOOKS
	 *
	 * @param SELF
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public java.math.BigDecimal call_COUNT_BOOKS() {
		org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS f = new org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS();
		f.setSELF(this);

		f.execute(getConfiguration());
		return f.getReturnValue();
	}

	/**
	 * Call TEST.U_AUTHOR_TYPE.GET_BOOKS
	 *
	 * @param SELF IN OUT parameter
	 * @param BOOK1 OUT parameter
	 * @param BOOK2 OUT parameter
	 * @param BOOKS OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_BOOKS call_GET_BOOKS() {
		org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_BOOKS p = new org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_BOOKS();
		p.setSELF(this);

		p.execute(getConfiguration());
		from(p.getSELF());
		return p;
	}

	/**
	 * Call TEST.U_AUTHOR_TYPE.LOAD
	 *
	 * @param SELF IN OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE call_LOAD() {
		org.jooq.test.oracle3.generatedclasses.udt.u_author_type.LOAD p = new org.jooq.test.oracle3.generatedclasses.udt.u_author_type.LOAD();
		p.setSELF(this);

		p.execute(getConfiguration());
		from(p.getSELF());
		return p.getSELF();
	}

	public U_AUTHOR_TYPE() {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE);
	}
}