package java_encapsulation_pack;

public class ATMAccount {

	private int pin;
	private double balance;

	public void setPin(int pin) {

		if (pin >= 1000 && pin <= 9999) {

			this.pin = pin;

		} else {

			System.out.println("Invalid PIN! PIN must be 4 digits.");
		}

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {

		if (amount <= 0) {

			System.out.println("Invalid withdrawal amount.");

		} else if (amount <= balance) {

			balance -= amount;

			System.out.println("Withdrawal successful. Remaining balance: " + balance);

		} else {

			System.out.println("Insufficient balance!");
		}
	}

	public static void main(String[] args) {

		ATMAccount acc = new ATMAccount();

		acc.setPin(1234);
		acc.setBalance(5000);

		acc.withdraw(2000); // valid withdrawal
		acc.withdraw(4000); // insufficient balance
		acc.setPin(99); // invalid PIN
	}

}
