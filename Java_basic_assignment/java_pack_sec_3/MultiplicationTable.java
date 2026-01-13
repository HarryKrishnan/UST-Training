package java_pack_sec_3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num;
		
		System.out.println("Enter the table num : ");
		num = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i+ "x" + num+" = "+(i * num));
		}
	}

}
