import java.util.ArrayList;

public class EmptyCollectionChecker {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Is list empty? " + list.isEmpty());
        
        list.add("Item");
        
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
