/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.routines;

/**
 * This class is generated by jOOQ.
 */
public class FilmNotInStock extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1665410204;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_FILM_ID = createParameter("p_film_id", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_STORE_ID = createParameter("p_store_id", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_FILM_COUNT = createParameter("p_film_count", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FilmNotInStock() {
		super(org.jooq.SQLDialect.MYSQL, "film_not_in_stock", org.jooq.examples.mysql.sakila.Sakila.SAKILA);

		addInParameter(P_FILM_ID);
		addInParameter(P_STORE_ID);
		addOutParameter(P_FILM_COUNT);
	}

	/**
	 * Set the <code>p_film_id</code> parameter to the routine
	 */
	public void setPFilmId(java.lang.Integer value) {
		setValue(P_FILM_ID, value);
	}

	/**
	 * Set the <code>p_store_id</code> parameter to the routine
	 */
	public void setPStoreId(java.lang.Integer value) {
		setValue(P_STORE_ID, value);
	}

	public java.lang.Integer getPFilmCount() {
		return getValue(P_FILM_COUNT);
	}
}
