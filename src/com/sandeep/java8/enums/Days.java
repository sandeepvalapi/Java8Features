package com.sandeep.java8.enums;

import java.util.EnumSet;

public enum Days {
	SUNDAY("Sunday"), MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY(
			"Friday"), SATURDAY("Saturday");

	private static final EnumSet<Days> HOLIDAYS = EnumSet.of(SUNDAY, SATURDAY);

	private final String dayName;

	Days(String dayName) {
		this.dayName = dayName;
	}

	public String getDayName() {
		return dayName;
	}

	public static boolean isHoliday(Days value) {
		return (value != null) && HOLIDAYS.contains(value);
	}
}
