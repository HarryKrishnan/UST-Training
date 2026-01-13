package java_polymorphism_pack;

public class Payment {

	void pay(int amount) {

		System.out.println("Amount : " + amount);
	}

	void pay(int amount, String mode) {

		System.out.println("Amount : " + amount + " Mode : " + mode);
	}

	public static void main(String[] args) {

		Payment payment = new Payment();

		payment.pay(10000);
		payment.pay(1000, "online");

	}

}
