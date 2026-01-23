import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Mumbai");
        cities.add("Sydney");
        
        System.out.println("Cities in the list:");
        System.out.println("===================");
        for (String city : cities) {
            System.out.println("- " + city);
        }
        
        System.out.println("\nTotal number of cities stored: " + cities.size());
    }
}
