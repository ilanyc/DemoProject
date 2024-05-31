package datedemo;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
	public static void main(String[] args) {
		
	//Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);
		//System.out.println(d.get(ChronoUnit.SECONDS));
		
	//Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);  
	  //System.out.println(d1.getSeconds());
	  //System.out.println(d1.isNegative());
	  
	  
	//Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    // System.out.println(d2.isNegative());    
	     
	     
	     
     //Duration d3 = d1.plus(d1);  
	     //System.out.println(d3.getSeconds()); 
		
		
 Duration duration = Duration.ofHours(5).plusMinutes(30);
	   System.out.println(duration);
	     
	     
	     
	}
}
