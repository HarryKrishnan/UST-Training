package java_pack_sec_1;

import java.util.Scanner;

public class AreaAndPerimeter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double length;
		double breadth;
		
		System.out.println("enter the length of the rectangle : : ");
		length = scan.nextDouble();
		
		System.out.println("enter the breadth of the rectangle : : ");
		breadth = scan.nextDouble();
		
		System.out.println("Area of rectangle : " + (length * breadth));
		System.out.println("Perimeter of rectangle : "+ 2 * (length + breadth));
		

	}

}
