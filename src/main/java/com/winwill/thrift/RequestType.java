/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.winwill.thrift;

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-03-16")
public enum RequestType implements org.apache.thrift.TEnum {
	SAY_HELLO(0), QUERY_TIME(1);

	private final int value;

	private RequestType(int value) {
		this.value = value;
	}

	/**
	 * Get the integer value of this enum value, as defined in the Thrift IDL.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Find a the enum type by its integer value, as defined in the Thrift IDL.
	 * 
	 * @return null if the value is not found.
	 */
	@org.apache.thrift.annotation.Nullable
	public static RequestType findByValue(int value) {
		switch (value) {
		case 0:
			return SAY_HELLO;
		case 1:
			return QUERY_TIME;
		default:
			return null;
		}
	}
}
