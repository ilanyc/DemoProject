package datedemo;

import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearExample {

	public static void main(String[] args) {
	
	//YearMonth ym = YearMonth.now();
	//String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
		//System.out.println(s);
		
		YearMonth ym1 = YearMonth.now();  
	    YearMonth ym2 = ym1.plus(Period.ofYears(2));  
	    System.out.println(ym2);  
		

	}

}
