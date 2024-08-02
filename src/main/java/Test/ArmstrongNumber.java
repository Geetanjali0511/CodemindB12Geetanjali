package Test;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
            int num = 370;
            int copy_of_num=num;
            int sum=0;
             int rem;
            while(num>0) {
            	
            	rem=num%10;
            	sum=sum+(rem*rem*rem);
            	num=num/10;
         
            }
            if(sum==copy_of_num) {
            	System.out.println("Given number "+copy_of_num+" is Armstrong number");
            }else {
            	System.out.println("Given number "+copy_of_num+"  is non Armstrong number");
            }
	}

}
