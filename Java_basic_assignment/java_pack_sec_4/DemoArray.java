package java_pack_sec_4;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter 5 integers:");

		for (int i = 0; i < 5; i++) {

			arr[i] = scan.nextInt();
		}

		System.out.println("Array elements are:");

		for (int i = 0; i < 5; i++) {

			System.out.println(arr[i]);
		}

	}

}
