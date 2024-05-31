package variable;

public class LocalVariable {
	
	double height,width,depth; //instance variable
     
	LocalVariable(double h,double w,double d) { //local variable
	    height = h;
		width = w;
		depth = d;
		
	
	}
	
	void display1() {
		double vol = height * width * depth;
		System.out.println("Volume is: " + vol);
		
	}
	
}
