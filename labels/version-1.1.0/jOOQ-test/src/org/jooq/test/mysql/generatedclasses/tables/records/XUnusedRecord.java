/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XUnusedRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setId(Integer value) {
		setValue(XUnused.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getId() {
		return getValue(XUnused.ID);
	}

	public XUnusedRecord(Result result) {
		super(result);
	}
}
