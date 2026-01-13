package java_encapsulation_pack;

public class BankAccount {

	private int accNum;
	private double balance = 0;

	public void setNum(int accNum) {

		this.accNum = accNum;

	}

	public void setBalance(int balance) {

		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Invalid balance! Balance cannot be negative.");
		}

	}

	public int getNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {

		BankAccount bank = new BankAccount();
		bank.setNum(11001100);
		bank.setBalance(15000);

		System.out.println("Account Number : " + bank.getNum());
		System.out.println("Account balance : " + bank.getBalance());

	}

}
