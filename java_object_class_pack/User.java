package java_object_class_pack;

class User {

	String email;
	String password;

	User(String email) {
		
		this.email = email;
		this.password = password;
	}

	User(String email, String password) {
		
		this.email = email;
		this.password = password;
	}

	void display() {
		
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void main(String[] args) {

		User u1 = new User("hari@gmail.com");
		u1.display();

		System.out.println("-------------");

		User u2 = new User("hari@gmail.com", "hari@007");
		u2.display();
	}
}
