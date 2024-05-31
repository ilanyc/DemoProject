package exception_handling;

public class ExceptionThrows {

	static void ageValidator(int age) throws ClassNotFoundException {

		
		if (age < 18) {

			throw new ClassNotFoundException("You can't declar");

		} else {
			System.out.println("You can declar");
		}
	}

	 public static void main(String[] args) {
		try {
			ageValidator(16); //if number is bigger 18, regular declaration will be run

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("Rest of code");

	}

}
