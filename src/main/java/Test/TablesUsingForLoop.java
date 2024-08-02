package Test;

public class TablesUsingForLoop {

	public static void main(String[] args) {
		table(2);

	}

	public static void table(int a) {
		for (int i = 1; i <= 10; i++) {
			int Result = a * i;
			System.out.print(Result + " ");

		}
		System.out.println(" ");
		System.out.println("##############");

		for (int i = 2 ; i <= 10 ; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
		}
		System.out.println("  ");

		System.out.println("#############");
	}
}
