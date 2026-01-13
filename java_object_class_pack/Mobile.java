package java_object_class_pack;

class Mobile {

	String brand;
	int ram;
	int storage;
	double price;

	Mobile(String brand) {

		this.brand = brand;
		ram = 4;
		storage = 64;
		price = 15000;
	}

	Mobile(String brand, int ram, int storage) {

		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
		price = 20000;
	}

	Mobile(String brand, int ram, int storage, double price) {

		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}

	void display() {

		System.out.println("Brand: " + brand);
		System.out.println("RAM: " + ram + " GB");
		System.out.println("Storage: " + storage + " GB");
		System.out.println("Price: " + price);
		System.out.println();
	}

	public static void main(String[] args) {

		Mobile m1 = new Mobile("Samsung");
		Mobile m2 = new Mobile("Redmi", 6, 128);
		Mobile m3 = new Mobile("Apple", 8, 256, 85000);

		m1.display();
		System.out.println("----------");
		m2.display();
		System.out.println("----------");
		m3.display();
	}
}
