package java_encapsulation_pack;

public class Student {

	private int id;
	private String name;

	public void setId(int id) {

		this.id = id;
	}

	public void setName(String name) {

		this.name = name;

	}

	public int getId() {
		return id;

	}

	public String getName() {

		return name;
	}

	public static void main(String[] args) {

		Student student = new Student();

		student.setId(31);
		student.setName("Harikrishnan");

		System.out.println("Id is : " + student.getId());
		System.out.println("Name is : " + student.getName());

	}

}
