import java.util.HashSet;

public class Assignment7 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("Colors in the HashSet:");
        System.out.println("======================");
        
        for (String color : colors) {
            System.out.println("- " + color);
        }
        
        System.out.println("\nTotal colors: " + colors.size());
        System.out.println("\nNote: HashSet does not maintain insertion order.");
    }
}
