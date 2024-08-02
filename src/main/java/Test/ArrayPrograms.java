package Test;

public class ArrayPrograms {

	public static void main(String[] args) {

		// Sort the array in DESC order

		int a[] = { 45, 76, 70, 723, 476, 98,37,932,432};

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

				for (int k = 0; k < a.length; k++) {
					System.out.print( a[k] +" " );
				}
				System.out.println( "   ");
				System.out.println("-------------------------------------------");
		
				System.out.println("     ");
				
				System.out.println("Smallest element from Array: "+ a[0]);
				System.out.println("Largest element from Array: "+ a[a.length-1]);
				
				System.out.println(" ");
				
				System.out.println("Second Smallest element from Array: "+ a[0+1]);
				System.out.println("Second largest element from Array: "+ a[a.length-2]);
				
				System.out.println("   ");
				System.out.println("Third Smallest element from Array: "+ a[0+2]);
				System.out.println("Third Largest element from Array: "+ a[a.length-3]);
				
		}
		
	
	

}
