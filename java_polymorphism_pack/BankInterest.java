package java_polymorphism_pack;

class Bank {

	double getInterestRate() {

		return 0;
	}
}

class SBI extends Bank {

	double getInterestRate() {
		return 6.5;

	}
}

class HDFC extends Bank {

	double getInterestRate() {
		return 7.0;
	}
}

public class BankInterest {

	public static void main(String[] args) {

		Bank bank;

		bank = new SBI();
		bank.getInterestRate();

		System.out.println("SBI interest : " + bank.getInterestRate());

		bank = new HDFC();
		bank.getInterestRate();

		System.out.println("HDFC interest : " + bank.getInterestRate());

	}

}
