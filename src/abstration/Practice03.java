package abstration;

abstract class Practice03 {

	abstract void run();
}

class Practice04 extends Practice03 {

	void run() {
		System.out.println("I love Bangladesh");
	}

	public static void main(String[] args) {

		Practice04 pr1 = new Practice04();
		pr1.run();

	}
}
