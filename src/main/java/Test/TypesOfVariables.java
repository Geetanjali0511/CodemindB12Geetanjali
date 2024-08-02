package Test;

class variables {

	// Instance Member Variables
	int a = 48;
	String str = "sharvi";
	float f = 65.34f;

	// Static Member Variables
	static int b = 37;
	static String s = "Sahil";

	// Final Member Variables
	final float h = 87.36f;
	final int MOB_NO = 637627625;

	public void multiply() {

		// local Member Variables
		int c = a * b;
		System.out.println("Multiplication: " + c);
	}

	public void subtraction() {

		float m = h - f;
		System.out.println("Subtraction: " + m);
	}
}

public class TypesOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variables var = new variables();

		var.multiply();
		var.subtraction();
		System.out.println("name: " + variables.s);
		System.out.println("Number: " + variables.b);
		System.out.println("Mob No: " + var.MOB_NO);
		System.out.println("Name: " + var.str);
	
	}

}
