package Test;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 45, 76, 34, 97 };

		System.out.println("length of Array: " + a.length);

		System.out.println("---------------------------------------");

		System.out.println(a[4]);

		System.out.println("--------------------------------------");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println(" ");
		System.out.println("---------------------------------------");

		int b[][] = { { 23, 32, 43 }, { 43, 45, 65 }, { 46, 76, 40 } };
		System.out.println(b[2][1]);
		System.out.println(b.length);
		System.out.println("--------------------------------------------");

		for (int i = 0; i < b.length; i++) 
			{
				for (int j = 0; j < b[i].length; j++) 
				{
					System.out.print(b[i][j] + "  ");
				}
			System.out.println();
		}
		System.out.print("--------------------------------------------");

	}
	
}
