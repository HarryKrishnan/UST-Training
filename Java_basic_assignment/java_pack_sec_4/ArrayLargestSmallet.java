package java_pack_sec_4;

import java.util.Scanner;

public class ArrayLargestSmallet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int size;

		System.out.println("Enter the array size : ");
		size = scan.nextInt();

		int arr[] = new int[size];

		System.out.println("enter the elements : ");

		for (int i = 0; i <= size - 1; i++) {

			arr[i] = scan.nextInt();
		}
		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 0; i < size; i++) {

			if (largest < arr[i]) {

				largest = arr[i];
			}
			if (smallest > arr[i]) {

				smallest = arr[i];
			}
		}
		System.out.println("largest = " + largest);
		System.out.println("Smallest = " + smallest);

	}

}
