package staticKeyword;

public class StaticRestriction {
	
	
	void display1 () {
		//display2();//no error
		
		
		System.out.println("I am non static method");
		
	}
	static void	display2 () {
		
		//display1();can't call non static method 
		System.out.println("I am static method");	
		
		
 }
}
