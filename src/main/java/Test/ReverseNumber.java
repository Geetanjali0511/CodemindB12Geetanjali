package Test;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=125465476;
		int reminder;		
		int add=0;
		
		while(number>0)
		{
			
			reminder=number%10;
			
			add=(add*10)+reminder;
			
			number=number/10;
			
		}
		System.out.println("Reverse number "+ add);
	}

}
