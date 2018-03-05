package com.sandeep.java8.enums;

import java.util.EnumSet;

public enum AccountStatus {
	ACTIVE("ACT", "1"), CLOSED("CLO", "2"), DORMANT("DOR", "3");

	private static final EnumSet<AccountStatus> VALID_ACCOUNTS = EnumSet.of(ACTIVE);

	private final String code;
	private final String number;

	AccountStatus(String code, String number) {
		this.code = code;
		this.number = number;
	}

	public String getCode() {
		return code;
	}

	// public static AccountStatus getByCode(String code){
	// List<AccountStatus> accSta = new ArrayList<>();
	// accSta.addAll(AccountStatus.values());
	// }

	public String getNumber() {
		return number;
	}

	public static AccountStatus getByCode(String code) {
		for (AccountStatus s : AccountStatus.values()) {
			if (s.code.equals(code)) {
				return s;
			}
		}
		return null;
	}

	public static boolean isValid(AccountStatus status) {
		return (status != null) && VALID_ACCOUNTS.contains(status);
	}

}
