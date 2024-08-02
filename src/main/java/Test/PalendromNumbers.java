package Test;

public class PalendromNumbers {

	public static void main(String[] args) {
		


		int number=121;
		int reminder;
		int copy_of_number=number;
		int add=0;
		
		while(number>0)
		{
			
			reminder=number%10;
			
			add=(add*10)+reminder;
			
			number=number/10;
			
		}
		if (copy_of_number==add)
		{System.out.println(copy_of_number + " is Palendrom number");}
			
		else {
			System.out.println("Number is not Palendrom number");
		}
	}

}
