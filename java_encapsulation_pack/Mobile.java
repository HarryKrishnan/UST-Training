package java_encapsulation_pack;

class Mobile {

	private String brand;
	private double price;

	public void setBrand(String brand) {

		this.brand = brand;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	public double getPriceWithGST() {

		double gst = price * 0.18;
		return price + gst;
	}

	public void displayMobile() {

		System.out.println("Brand: " + brand);
		System.out.println("Price with GST: " + getPriceWithGST());
	}

	public static void main(String[] args) {

		Mobile m = new Mobile();

		m.setBrand("Samsung");
		m.setPrice(20000);

		m.displayMobile();
	}
}
