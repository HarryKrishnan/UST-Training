package java_inheritance_pack;

class Vehicle {

	double speed;

}

public class Car extends Vehicle {

	String brand;

	void show() {

		System.out.println("The Brand is  :  " + brand);
		System.out.println("The speed is :  " + speed + "kmp/h");
	}

	public static void main(String[] args) {
		
		Car car = new Car ();
		
		car.brand = "BMW";
		car.speed = 245.6 ;
		
		car.show();

	}

}
