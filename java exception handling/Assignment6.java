import java.util.HashSet;

public class Assignment6 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        
        System.out.println("Adding numbers to HashSet (including duplicates)...");
        System.out.println("====================================================");
        
        System.out.println("Adding 10: " + numbers.add(10));
        System.out.println("Adding 20: " + numbers.add(20));
        System.out.println("Adding 30: " + numbers.add(30));
        System.out.println("Adding 10 (duplicate): " + numbers.add(10));
        System.out.println("Adding 40: " + numbers.add(40));
        System.out.println("Adding 20 (duplicate): " + numbers.add(20));
        System.out.println("Adding 50: " + numbers.add(50));
        System.out.println("Adding 30 (duplicate): " + numbers.add(30));
        
        System.out.println("\nFinal HashSet (duplicates removed):");
        System.out.println("====================================");
        System.out.println(numbers);
        
        System.out.println("\nTotal unique numbers stored: " + numbers.size());
        System.out.println("\nNote: add() returns 'false' when trying to add a duplicate value.");
    }
}
