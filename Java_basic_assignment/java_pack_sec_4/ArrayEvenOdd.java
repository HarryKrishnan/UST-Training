package java_pack_sec_4;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int arr[] = new int[5];
		int evenCount = 0;
		int oddCount = 0;

		System.out.println("Enter the elements in the array : ");

		for (int i = 0; i < 5; i++) {

			arr[i] = scan.nextInt();

		}

		for (int i = 0; i < 5; i++) {

			if (arr[i] % 2 == 0) {
				evenCount = evenCount + 1;
			}
			if (arr[i] % 2 != 0) {

				oddCount = oddCount + 1;
			}

		}
		System.out.println("Even count is : " + evenCount);
		System.out.println("Even count is : " + oddCount);

	}

}
