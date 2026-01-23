import java.util.ArrayList;

public class Assignment5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        
        System.out.println("Fruits in the list:");
        System.out.println("===================");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        System.out.println("\nChecking if 'Apple' exists...");
        
        if (fruits.contains("Apple")) {
            System.out.println("✓ Apple is present in the list!");
        } else {
            System.out.println("✗ Apple is not present in the list.");
        }
        
        System.out.println("\nChecking if 'Strawberry' exists...");
        if (fruits.contains("Strawberry")) {
            System.out.println("✓ Strawberry is present in the list!");
        } else {
            System.out.println("✗ Strawberry is not present in the list.");
        }
    }
}
