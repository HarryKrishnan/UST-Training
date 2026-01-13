import java.util.ArrayList;

public class Assignment12 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        
        System.out.println("Checking if the list is empty...");
        System.out.println("Is the list empty? " + items.isEmpty());
        
        System.out.println("\nAdding items to the list...");
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        
        System.out.println("\nCurrent list: " + items);
        
        System.out.println("\nIs the list empty now? " + items.isEmpty());
        
        System.out.println("\nClearing the list...");
        items.clear();
        
        System.out.println("Is the list empty after clearing? " + items.isEmpty());
        
        System.out.println("\nList size: " + items.size());
        System.out.println("isEmpty() returns: " + items.isEmpty());
    }
}
