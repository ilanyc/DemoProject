package staticKeyword;

public class StaticBlock {

	//static int id;1
	//static String name;1
	
	static {
		//id = 101; 1
		//name = "Ila";1
	System.out.println("Static block");	
		
	}
	
	//static void display() { 1
		//System.out.println("Id: " + id);1
		//System.out.println("Name: " + name);1
		
	//}1
	public static void main(String[] args) {
		//StaticBlock.display();1
		
		System.out.println("main method");
		
	}
}
