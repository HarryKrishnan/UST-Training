import java.util.ArrayList;

public class CityCollectionSize {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Mumbai");
        
        System.out.println("Total number of cities: " + cities.size());
    }
}
