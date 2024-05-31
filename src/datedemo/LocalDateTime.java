package datedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class LocalDateTime {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
		
		String localDate = dateformat.format(date);
		System.out.println("Local Date: " + localDate);
		
		
		
		
		
		
		

	}

	

}
