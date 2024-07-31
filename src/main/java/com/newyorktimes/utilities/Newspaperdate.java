package com.newyorktimes.utilities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Newspaperdate {

	public static String getDayMonthDateYear()
	{
		Calendar cal=Calendar.getInstance();
		int caldate = cal.get(Calendar.DATE);
		int calmonth = cal.get((Calendar.MONTH)+1);
		int calyear= cal.get(Calendar.YEAR);

		String pattern = String. valueOf(caldate-calmonth-calyear); 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		String dateParts[] = date.split("-");
		LocalDate currentDate = LocalDate.parse(date);
		// Get day from date
		int day = currentDate.getDayOfMonth();
		String onlydate = dateParts[0];
		// Get month from date
		Month month = currentDate.getMonth();
		// Get year from date
		int year = currentDate.getYear();

		String expectedday = String. valueOf(day); 
		String expectedmonth = String. valueOf(month); 
		String expecteddate = String. valueOf(month);
		String expectedyear = String. valueOf(year);
		String ExpectedDate = String.join(",", expectedday, expectedmonth, expecteddate, expectedyear);
		return ExpectedDate;  
	}

}
