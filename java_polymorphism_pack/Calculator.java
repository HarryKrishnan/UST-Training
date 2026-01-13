package java_polymorphism_pack;

public class Calculator {

	int add(int a, int b) {

		return (a + b);
	}

	int add(int a, int b, int c) {

		return (a + b + c);

	}

	double add(double a, double b) {

		return (a + b);
	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		System.out.println("ans : " + cal.add(10, 5));
		System.out.println("ans : " + cal.add(5, 6, 7));
		System.out.println("ans : " + cal.add(12.5, 12.5));

	}

}
