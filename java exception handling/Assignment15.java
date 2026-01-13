import java.util.ArrayList;

public class Assignment15 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        
        System.out.println("ArrayList:");
        System.out.println("==========");
        System.out.println(fruits);
        
        String[] fruitsArray = fruits.toArray(new String[0]);
        
        System.out.println("\nConverted to Array:");
        System.out.println("===================");
        for (int i = 0; i < fruitsArray.length; i++) {
            System.out.println("Index " + i + ": " + fruitsArray[i]);
        }
        
        System.out.println("\nArray length: " + fruitsArray.length);
    }
}
