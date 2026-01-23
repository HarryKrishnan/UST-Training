package java_polymorphism_pack;

class Shapes {

	void draw() {

		System.out.println("i am goig to draw a shape");
	}
}

class Circle extends Shapes {

	void draw() {

		System.out.println("i am going to draw a circle");
	}
}

class Rectangle extends Shapes {

	void draw() {

		System.out.println("i am going to draw a rectangle");
	}
}

public class Shape {

	public static void main(String[] args) {

		Shapes sh = new Circle();
		sh.draw();
		sh = new Rectangle();
		sh.draw();
		sh = new Shapes();
		sh.draw();

	}

}
