import java.util.HashSet;

public class ColorSetDisplay {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
