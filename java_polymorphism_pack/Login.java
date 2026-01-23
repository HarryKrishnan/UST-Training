package java_polymorphism_pack;

public class Login {

	String email;
	String password;

	void login(String email) {

		System.out.println("email : " + email);
	}

	void login(String email, String password) {

		System.out.println("Password : " + password);
	}

	public static void main(String[] args) {

		Login log = new Login();

		log.login("hari@gmail.com");
		log.login("hari@gmail.com", "Hari@2000");

	}

}
