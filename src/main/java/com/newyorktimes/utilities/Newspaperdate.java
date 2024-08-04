package com.newyorktimes.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Newspaperdate {

	public static String getDayMonthDateYear() {
		// Create a SimpleDateFormat instance with the desired format
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.ENGLISH);
		// Format the current date
		return sdf.format(new Date());
	}
}
