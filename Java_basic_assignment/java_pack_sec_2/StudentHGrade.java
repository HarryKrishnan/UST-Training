package java_pack_sec_2;

import java.util.Scanner;

public class StudentHGrade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int marks;
		int choice;

		System.out.println("Enter the mark : ");
		marks = scan.nextInt();

		if (marks >= 90) {
			choice = 1;
		} else if (marks >= 75) {
			choice = 2;
		} else if (marks >= 60) {
			choice = 3;
		} else {
			choice = 4;
		}

		switch (choice) {
		case 1:
			System.out.println("Grade: A");
			break;

		case 2:
			System.out.println("Grade: B");
			break;

		case 3:
			System.out.println("Grade: C");
			break;

		default:
			System.out.println("Grade: Fail");
		}

	}

}
