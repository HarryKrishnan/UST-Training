package java_inheritance_pack;

class Bank {

	double interestRate = 5.0;

}

public class SavingAccount extends Bank {

	void calculateInterest(double amount) {

		double interest = (amount * interestRate) / 100;

		System.out.println("Interest Amount: " + interest);
	}

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount();

		sa.calculateInterest(10000);
	}

}
