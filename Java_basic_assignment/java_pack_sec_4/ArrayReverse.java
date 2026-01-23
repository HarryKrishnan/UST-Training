package java_pack_sec_4;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int arr[] = new int [6];
		
		
		System.out.println("Enter the elements in the array : ");

//		int arr[] = new int[6];

		for (int i = 0; i < 6; i++) {
		    arr[i] = scan.nextInt();
		}

		for (int i = 5; i >= 0; i--) {
		    System.out.println(arr[i]);
		}


	}

}
