import java.util.LinkedList;

public class Assignment11 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        
        System.out.println("Adding numbers to LinkedList...");
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        
        System.out.println("\nNumbers in LinkedList:");
        System.out.println("======================");
        
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }
        
        System.out.println("\nUsing for-each loop:");
        System.out.println("====================");
        for (Integer number : numbers) {
            System.out.println("- " + number);
        }
        
        System.out.println("\nTotal elements: " + numbers.size());
    }
}
