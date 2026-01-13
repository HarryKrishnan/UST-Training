package java_pack_sec_4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        System.out.println("Array in ascending order:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
