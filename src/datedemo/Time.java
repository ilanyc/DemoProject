package datedemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {
		
		//LocalTime time = LocalTime.now();
		
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		
		//String formattedTime = time.format(formatter);
		
		//System.out.println(formattedTime);
		
		
		
	LocalTime time1 = LocalTime.of(10,43,12);  
	System.out.println(time1);  
	
     LocalTime time2=time1.minusHours(2);  
	 LocalTime time3=time2.minusMinutes(34);  
     System.out.println(time3);  
		
	}

	

}
