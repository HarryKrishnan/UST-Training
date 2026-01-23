import java.util.ArrayList;

public class CollectionClearer {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        
        System.out.println("Before clear: " + items);
        
        items.clear();
        
        System.out.println("After clear: " + items);
        System.out.println("Is list empty? " + items.isEmpty());
    }
}
