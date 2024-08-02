package Test;

public class FebnosisSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		int num1=1;
		System.out.print(num+" "+num1+" ");
		   for(int i=1;i<=10;i++) {
		  int num3=num+num1; 
		   System.out.print(num3+" ");
		   
		   num=num1;
		   num1=num3;
	}
		   }

}
