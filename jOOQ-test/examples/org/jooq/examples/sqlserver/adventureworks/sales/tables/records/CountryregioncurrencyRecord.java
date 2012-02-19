/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "CountryRegionCurrency", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"CountryRegionCode", "CurrencyCode"})
})
public class CountryregioncurrencyRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord> {

	private static final long serialVersionUID = 1002708753;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	public void setCountryregioncode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.COUNTRYREGIONCODE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CountryRegionCode")
	public java.lang.String getCountryregioncode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.COUNTRYREGIONCODE);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_Currency_CurrencyCode
	 * FOREIGN KEY (CurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	public void setCurrencycode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.CURRENCYCODE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_Currency_CurrencyCode
	 * FOREIGN KEY (CurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CurrencyCode")
	public java.lang.String getCurrencycode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.CURRENCYCODE);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.MODIFIEDDATE);
	}

	/**
	 * Create a detached CountryregioncurrencyRecord
	 */
	public CountryregioncurrencyRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY);
	}
}