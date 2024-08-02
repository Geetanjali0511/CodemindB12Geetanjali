package Test;

public class NestedIfStatement {

	public static void main(String[] args) {
		int preliummarks = 70;
		int mainsmarks = 76;
		int interviewmarks = 77;

		if (preliummarks > 65) {
			   System.out.println("Pre pass");
			
			if (mainsmarks > 60) {
			    System.out.println("Mains pass");
				
				if (interviewmarks > 75) {
					System.out.println("Congrats, Interview cleared.");
				}
				else {
					System.out.println("Interview not cleared");
				}
			} 
			else {
				System.out.println("Mains not pass");
			}
		} 
		else {
			System.out.println("Pre not pass");
		}
	}
}