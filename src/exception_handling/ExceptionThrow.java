package exception_handling;

public class ExceptionThrow {
	
	static void friends(int age){
		
		int friends = 0;
		if(friends<18) {
			throw new ArithmeticException("You can't declar");
			
		}else{
			System.out.println("You can declar");
		}
	}
  public static void main(String[] args) {
	try {
		friends(16);
		
	}catch (ArithmeticException e) {
		System.out.println(e);
	}
	System.out.println("Rest of code");
}
}
