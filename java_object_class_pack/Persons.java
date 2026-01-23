package java_object_class_pack;

class Persons {

    String name;
    int age;

    Persons(String name) {
        this(name, 0);   
    }

    Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
    	
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Persons p1 = new Persons("Hari");
        p1.display();

        System.out.println();

        Persons p2 = new Persons("Krishna", 22);
        p2.display();
    }
}

