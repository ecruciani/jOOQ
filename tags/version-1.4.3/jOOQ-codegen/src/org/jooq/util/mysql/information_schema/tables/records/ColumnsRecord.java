/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables.records;


import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.mysql.information_schema.tables.Columns;


/**
 * This class is generated by jOOQ.
 */
public class ColumnsRecord extends TableRecordImpl<ColumnsRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(String value) {
		setValue(Columns.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableCatalog() {
		return getValue(Columns.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(String value) {
		setValue(Columns.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableSchema() {
		return getValue(Columns.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(Columns.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(Columns.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnName(String value) {
		setValue(Columns.COLUMN_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnName() {
		return getValue(Columns.COLUMN_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setOrdinalPosition(Integer value) {
		setValue(Columns.ORDINAL_POSITION, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getOrdinalPosition() {
		return getValue(Columns.ORDINAL_POSITION);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnDefault(String value) {
		setValue(Columns.COLUMN_DEFAULT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnDefault() {
		return getValue(Columns.COLUMN_DEFAULT);
	}

	/**
	 * An uncommented item
	 */
	public void setIsNullable(String value) {
		setValue(Columns.IS_NULLABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIsNullable() {
		return getValue(Columns.IS_NULLABLE);
	}

	/**
	 * An uncommented item
	 */
	public void setDataType(String value) {
		setValue(Columns.DATA_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDataType() {
		return getValue(Columns.DATA_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setCharacterMaximumLength(Integer value) {
		setValue(Columns.CHARACTER_MAXIMUM_LENGTH, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getCharacterMaximumLength() {
		return getValue(Columns.CHARACTER_MAXIMUM_LENGTH);
	}

	/**
	 * An uncommented item
	 */
	public void setCharacterOctetLength(Integer value) {
		setValue(Columns.CHARACTER_OCTET_LENGTH, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getCharacterOctetLength() {
		return getValue(Columns.CHARACTER_OCTET_LENGTH);
	}

	/**
	 * An uncommented item
	 */
	public void setNumericPrecision(Integer value) {
		setValue(Columns.NUMERIC_PRECISION, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getNumericPrecision() {
		return getValue(Columns.NUMERIC_PRECISION);
	}

	/**
	 * An uncommented item
	 */
	public void setNumericScale(Integer value) {
		setValue(Columns.NUMERIC_SCALE, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getNumericScale() {
		return getValue(Columns.NUMERIC_SCALE);
	}

	/**
	 * An uncommented item
	 */
	public void setCharacterSetName(String value) {
		setValue(Columns.CHARACTER_SET_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCharacterSetName() {
		return getValue(Columns.CHARACTER_SET_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setCollationName(String value) {
		setValue(Columns.COLLATION_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCollationName() {
		return getValue(Columns.COLLATION_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnType(String value) {
		setValue(Columns.COLUMN_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnType() {
		return getValue(Columns.COLUMN_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnKey(String value) {
		setValue(Columns.COLUMN_KEY, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnKey() {
		return getValue(Columns.COLUMN_KEY);
	}

	/**
	 * An uncommented item
	 */
	public void setExtra(String value) {
		setValue(Columns.EXTRA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getExtra() {
		return getValue(Columns.EXTRA);
	}

	/**
	 * An uncommented item
	 */
	public void setPrivileges(String value) {
		setValue(Columns.PRIVILEGES, value);
	}

	/**
	 * An uncommented item
	 */
	public String getPrivileges() {
		return getValue(Columns.PRIVILEGES);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnComment(String value) {
		setValue(Columns.COLUMN_COMMENT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnComment() {
		return getValue(Columns.COLUMN_COMMENT);
	}

	public ColumnsRecord(Configuration configuration) {
		super(configuration, Columns.COLUMNS);
	}
}
