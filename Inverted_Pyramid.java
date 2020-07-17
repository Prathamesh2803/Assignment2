package project1;
import java.util.Scanner;
public class Inverted_Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking noOfRows value from the user

		System.out.println("No. of rows: ");

		int n = sc.nextInt();
        int rowsCount=n;
		sc.close();

		// Implementing the logic

		for (int i = 0; i < n; i++) {
			// Printing i*2 spaces at the beginning of each row

			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}

			// Printing j where j value will be from 1 to rowCount

			for (int j = 1; j <= rowsCount; j++) {
				System.out.print(j + " ");
			}

			// Printing j where j value will be from rowCount-1 to 1

			for (int j = rowsCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();

			// Decrementing the rowCount

			rowsCount--;
		}
	}
}
