package datedemo;

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthExample {

	public static void main(String[] args) {
		
		MonthDay month = MonthDay.now();
	    LocalDate date = month.atYear(2024);
		System.out.println(date);
		
		boolean b = month.isValidYear(2000);  
	    System.out.println(b);  	
		
		
		
	}
	
	
}
