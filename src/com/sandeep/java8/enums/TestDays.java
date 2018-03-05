package com.sandeep.java8.enums;

import java.util.EnumSet;

public class TestDays {
	public static void main(String[] args) {
		System.out.println(Days.isHoliday(Days.SUNDAY));
		
		//Returns a set, Explore more for noneoff()
		System.out.println(EnumSet.allOf(Days.class));
		
		System.out.println("Account Status "+ AccountStatus.isValid(AccountStatus.CLOSED));
		
		System.out.println("Get by code "+ AccountStatus.getByCode("CLO").getNumber());
	}
}
