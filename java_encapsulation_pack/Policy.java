package java_encapsulation_pack;

class Policy {

	private int policyId;
	private double premium;

	public void setPolicyId(int policyId) {
		
		this.policyId = policyId;
	}

	public void calculatePremium(int age) {
		
		if (age < 25) {
			premium = 5000;
		} else if (age <= 40) {
			premium = 4000;
		} else {
			premium = 3000;
		}
	}

	public void displayPolicy() {
		
		System.out.println("Policy ID: " + policyId);
		System.out.println("Premium: " + premium);
	}

	public static void main(String[] args) {

		Policy p = new Policy();

		p.setPolicyId(101);
		p.calculatePremium(30);

		p.displayPolicy();
	}
}
