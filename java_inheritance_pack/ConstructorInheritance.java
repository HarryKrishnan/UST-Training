package java_inheritance_pack;

class Pperson {
	String name;

	Pperson(String name) {
		this.name = name;
	}
}

public class ConstructorInheritance extends Pperson {
	
	int rollNo;

	ConstructorInheritance(String name, int rollNo) {
		
		super(name);
		this.rollNo = rollNo;
	}

	void display() {
		
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
	}

	public static void main(String[] args) {

		ConstructorInheritance s = new ConstructorInheritance("Hari", 101);
		
		s.display();
	}
}
