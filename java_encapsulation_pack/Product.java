package java_encapsulation_pack;

public class Product {

	private double price;

	public void setPrice(double price) {

		if ((price >= 100) && (price <= 100000)) {

			this.price = price;
		} else {
			System.out.println("invalid");
		}
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {

		Product product = new Product();
		product.setPrice(1500);
		System.out.println("price is  : " + product.getPrice());

		System.out.println();

		product.setPrice(45);
		System.out.println("price of this is " + product.getPrice());

	}

}
