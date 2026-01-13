import java.util.ArrayList;

public class CollectionToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        
        String[] array = list.toArray(new String[0]);
        
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
