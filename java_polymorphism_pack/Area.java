package java_polymorphism_pack;

public class Area {

	int area(int side) {

		return (side * side);
	}

	int area(int length, int breadth) {

		return (length * breadth);

	}

	double area(double radius) {

		return (3.14 * (radius * radius));
	}

	public static void main(String[] args) {

		Area ar = new Area();

		System.out.println("Area of square : " + ar.area(4));
		System.out.println("Area of rectangle : " + ar.area(4, 5));
		System.out.println("Area of circle : " + ar.area(3));

	}

}
