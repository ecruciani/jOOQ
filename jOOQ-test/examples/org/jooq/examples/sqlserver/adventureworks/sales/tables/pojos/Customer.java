/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Customer", schema = "Sales")
public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = -1877030252;

	private java.lang.Integer  customerid;
	private java.lang.Integer  territoryid;
	private java.lang.String   accountnumber;
	private java.lang.String   customertype;
	private java.lang.String   rowguid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "CustomerID", unique = true)
	public java.lang.Integer getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(java.lang.Integer customerid) {
		this.customerid = customerid;
	}

	@javax.persistence.Column(name = "TerritoryID")
	public java.lang.Integer getTerritoryid() {
		return this.territoryid;
	}

	public void setTerritoryid(java.lang.Integer territoryid) {
		this.territoryid = territoryid;
	}

	@javax.persistence.Column(name = "AccountNumber")
	public java.lang.String getAccountnumber() {
		return this.accountnumber;
	}

	public void setAccountnumber(java.lang.String accountnumber) {
		this.accountnumber = accountnumber;
	}

	@javax.persistence.Column(name = "CustomerType")
	public java.lang.String getCustomertype() {
		return this.customertype;
	}

	public void setCustomertype(java.lang.String customertype) {
		this.customertype = customertype;
	}

	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return this.rowguid;
	}

	public void setRowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}