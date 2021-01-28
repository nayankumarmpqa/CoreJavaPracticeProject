package dateConcept;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarDemo {

	public static void main(String[] args) {
		// day month week year time seconds
		//date class from java util package
		
		Date date = new Date();
		System.out.println(date.toString());
		
		//We can pick date formats from https://www.tutorialspoint.com/Date-Formatting-Using-SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yy, w  , z, K:m:s:a");
		
		System.out.println(sdf.format(date));
		
		
		//====================================================//
		System.out.println("Lets learn about calendar class objects");
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTime());
		//System.out.println(cal.getTimeZone());
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.MONDAY));
		System.err.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
