package java_pack_sec_4;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter 5 elements:");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter element to search: ");
		int key = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			if (arr[i] == key) {
				System.out.println("Element found");
				return;
			}
		}

		System.out.println("Element not found");
	}
}
