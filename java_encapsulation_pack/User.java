package java_encapsulation_pack;

class User {

	private String email;
	private String password;

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		if (password.length() >= 8) {
			this.password = password;
		} else {
			System.out.println("Password must be at least 8 characters long.");
		}
	}

	public void displayUser() {
		System.out.println("Email: " + email);
		System.out.println("Password: ********");
	}

	public static void main(String[] args) {

		User user = new User();

		user.setEmail("hari@example.com");
		user.setPassword("password123");

		user.displayUser();

		// Invalid password
		user.setPassword("12345");
	}
}
