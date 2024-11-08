package com.sandeep.java8.clockutils;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * The Java8date class demonstrates various ways to work with dates using the java.time package introduced in Java 8.
 * It includes examples of getting the current date, creating specific dates, handling time zones, and working with epoch days.
 * 
 * <p>Examples include:</p>
 * <ul>
 *   <li>Getting the current date</li>
 *   <li>Creating a LocalDate with specific year, month, and day</li>
 *   <li>Handling invalid date inputs</li>
 *   <li>Getting the current date in a specific time zone</li>
 *   <li>Creating a date from the epoch day</li>
 *   <li>Creating a date from the day of the year</li>
 * </ul>
 * 
 * <p>Note: Some examples are commented out to demonstrate potential exceptions.</p>
 * 
 * @author Sandeep
 */
public class Java8date {

	public static void main(String[] args) {

		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date=" + today);

		// Creating LocalDate by providing input arguments
		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specific Date=" + firstDay_2014);

		// Try creating date by providing invalid inputs
		// LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
		// Exception in thread "main" java.time.DateTimeException:
		// Invalid date 'February 29' as '2014' is not a leap year

		// Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST=" + todayKolkata);

		// java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
		// LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));

		// Getting date from the base date i.e 01/01/1970
		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date= " + dateFromBase);

		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
		System.out.println("100th day of 2014=" + hundredDay2014);
	}
}
