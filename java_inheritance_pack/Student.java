package java_inheritance_pack;

class Person {

	String name;
	int age;
}

public class Student extends Person {

	int rollNo;

	void display() {

		System.out.println("The name is :" + name);
		System.out.println("The age is :" + age);
		System.out.println("The Roll No is :" + rollNo);
	}

	public static void main(String[] args) {

		Student user = new Student();

		user.name = "Harikrishnan";
		user.age = 25;
		user.rollNo = 31;

		user.display();

	}

}
