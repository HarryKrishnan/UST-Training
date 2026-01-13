import java.util.ArrayList;

public class FruitChecker {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        
        if (fruits.contains("Apple")) {
            System.out.println("Apple is present");
        } else {
            System.out.println("Apple is not present");
        }
    }
}
