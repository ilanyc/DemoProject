package abstration;

public class AbsPrac02 extends AbsPrac01 {

	void sendmassage() {

		System.out.println("Bangladesh is my country");

	}

	public static void main(String[] args) {

		AbsPrac01 ab;

		ab = new AbsPrac02();
		ab.sendmassage();

	}

}
