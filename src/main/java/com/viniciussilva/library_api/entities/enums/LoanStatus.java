package com.viniciussilva.library_api.entities.enums;

public enum LoanStatus {

	LOANED(1),
	REUTRNED(2),
	LATE(3);
	
	private int code;
	
	private LoanStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static LoanStatus valueOf(int code) {
		for(LoanStatus value : LoanStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid LoanStatus code");
	}
	
}
