package java_object_class_pack;

class BankAccount {

	int accountNumber;
	String holderName;
	double balance;

	BankAccount(int accNo, String name, double bal) {

		accountNumber = accNo;
		holderName = name;
		balance = bal;
	}

	void showAccount() {

		System.out.println("Account Number: " + accountNumber);
		System.out.println("Holder Name: " + holderName);
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {

		BankAccount acc = new BankAccount(007, "Hari", 50000);
		acc.showAccount();
	}
}
