package datedemo;

import java.time.LocalDate;

public class Localdate1 {

	public static void main(String[] args) {
		
		//LocalDate date = LocalDate.now();
		//LocalDate yesterday = date.minusDays(1);
		//LocalDate tomorrow = yesterday.plusDays(2);
		
		//System.out.println("Today date:  " + date);
		//System.out.println("Yesterday date: " + yesterday);
		//System.out.println("Tommorrow date: " + tomorrow);
		
		
		
		LocalDate date1 = LocalDate.of(2017, 1, 13);    
	    System.out.println(date1.isLeapYear());
	    
	    LocalDate date2 = LocalDate.of(2016, 9, 23);    
	    System.out.println(date2.isLeapYear());    

		
		
		
		
	}

}
