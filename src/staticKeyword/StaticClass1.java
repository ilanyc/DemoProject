package staticKeyword;

public class StaticClass1 {
	
	String name;
	int id;
	static String institutionName = "Nexxvali";
	
	
    StaticClass1(String n,int i){
    	name = n;
    	id = i;
	
}
    
  void displayInformation() {
	  System.out.println("Name: " +name);
	  System.out.println("Id: " +id);
	  System.out.println("Institution Name: " +institutionName);
	  
  }
}
