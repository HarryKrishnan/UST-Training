package java_encapsulation_pack;

class Customer {

	private String name;
	private int age;

	public void setName(String name) {

		this.name = name;
	}

	public void setAge(int age) {

		if (age >= 18) {
			this.age = age;
		} else {
			System.out.println("Invalid age! Customer must be at least 18 years old.");
		}
	}

	public String getCustomerDetails() {

		return "Customer Name: " + name + ", Age: " + age;
	}

	public static void main(String[] args) {

		Customer c = new Customer();

		c.setName("Rahul");
		c.setAge(22);

		System.out.println(c.getCustomerDetails());

		// Invalid age test
		c.setAge(16);
	}
}
