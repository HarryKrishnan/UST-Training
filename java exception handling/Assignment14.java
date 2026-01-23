import java.util.ArrayList;

public class Assignment14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("Integer values stored using wrapper class:");
        System.out.println("===========================================");
        
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }
        
        System.out.println("\nTotal values: " + numbers.size());
        
        System.out.println("\nDemonstrating wrapper class features:");
        System.out.println("======================================");
        Integer firstValue = numbers.get(0);
        System.out.println("First value: " + firstValue);
        System.out.println("Type: " + firstValue.getClass().getName());
    }
}
