package java_polymorphism_pack;

class Printer {

    public void print(int number) {
        System.out.println("Printing integer: " + number);
    }

    public void print(String text) {
        System.out.println("Printing text: " + text);
    }

    public void print(int number, String text) {
        System.out.println("Printing integer: " + number + ", text: " + text);
    }

    public static void main(String[] args) {

        Printer p = new Printer();

        p.print(10);
        p.print("Hello Java");
        p.print(25, "Pages printed");
    }
}

