package Test;



public class FindPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindPrimeNumbers findprimenumbers=new FindPrimeNumbers();
		
		for(int j=2;j<=100;j++) {
			findprimenumbers.Primenumbers(j);
		}
		
	}
	
	public void Primenumbers (int num) {
	
	int count=0;
	
	for (int i = 2; i<num; i++) {
		if (num%i==0) {
			count++;
		}	
	}
	
	if(count==0) {
		System.out.println( num);
	}
	//else if (count>0) {
		//System.out.println(num+" is not prime number");
	//}
	}
}