import java.util.ArrayList;

public class Assignment2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Adding 5 numbers to the ArrayList...");
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("\nOriginal List:");
        System.out.println("==============");
        System.out.println(numbers);
        
        System.out.println("\nRemoving element at index 2 (value: " + numbers.get(2) + ")...");
        numbers.remove(2);
        
        System.out.println("\nUpdated List After Removal:");
        System.out.println("===========================");
        System.out.println(numbers);
        
        System.out.println("\nDetailed View:");
        System.out.println("==============");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }
    }
}
