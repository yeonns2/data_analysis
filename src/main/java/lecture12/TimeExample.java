package lecture12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExample {

	public static void main(String[] args) throws ParseException {
		
		long t = System.currentTimeMillis(); 
		System.out.println(t);
		
		Date date = new Date(t);
		System.out.println(date);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		System.out.println(format);
		String dateString = "2003-10-25";
		Date d = sdf.parse(dateString);
		System.out.println(d);
		System.out.println(sdf.format(d));
		System.out.println(d.getDay());
		
	}

}
