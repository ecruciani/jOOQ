/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public enum BooleanTrueFalseUc implements org.jooq.EnumType {
	TRUE("TRUE"),

	FALSE("FALSE"),

	;

	private final java.lang.String literal;

	private BooleanTrueFalseUc(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "BOOLEAN_TRUE_FALSE_UC";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}