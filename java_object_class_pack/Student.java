package java_object_class_pack;

public class Student {

	int id;
	String name;

	void displayDetails() {

		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
	}

	public static void main(String[] args) {

		Student student = new Student();

		student.id = 007;
		student.name = "Harikrishnan";

		student.displayDetails();

	}

}
