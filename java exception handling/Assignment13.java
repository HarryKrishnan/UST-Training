import java.util.ArrayList;

public class Assignment13 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");
        items.add("Item 5");
        
        System.out.println("Original List:");
        System.out.println("==============");
        System.out.println(items);
        System.out.println("Size: " + items.size());
        
        System.out.println("\nClearing all elements...");
        items.clear();
        
        System.out.println("\nList after clear():");
        System.out.println("===================");
        System.out.println(items);
        System.out.println("Size: " + items.size());
        System.out.println("Is empty? " + items.isEmpty());
    }
}
