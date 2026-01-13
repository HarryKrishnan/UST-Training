package java_inheritance_pack;

class Animal {
	
	void eat() {
		
		System.out.println("Animal is eating");
	}
}

public class Dog extends Animal{
	
	void bark() {
		
		System.out.println("The dog is barking");
	}

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.bark();
		dog.eat();

	}

}
