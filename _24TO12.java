// Java program to convert 24 hour time format to 12 hour format
//author @sadam
import java.util.Date;
import java.text.SimpleDateFormat;
public class _24TO12 {
	public static void main(String[] args)
	{
		// Getting the current current time
		Date date = new Date();
		System.out.println("Current Time is : " + date);
		// set format in 12 hours
		SimpleDateFormat time12 = new SimpleDateFormat("hh.mm aa");
		String time = time12.format(date);
		// display time as per format
		System.out.println("Hurrah!, i have converted 24 hour format time to 12 hour format for you :) : " + time);
	}
}
