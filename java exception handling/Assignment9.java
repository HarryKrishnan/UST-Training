import java.util.HashMap;
import java.util.Map;

public class Assignment9 {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        
        countries.put("US", "United States");
        countries.put("IN", "India");
        countries.put("JP", "Japan");
        
        System.out.println("Method 1: Using keySet()");
        System.out.println("=========================");
        for (String code : countries.keySet()) {
            System.out.println("Code: " + code + " -> Country: " + countries.get(code));
        }
        
        System.out.println("\nMethod 2: Using entrySet()");
        System.out.println("===========================");
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Code: " + entry.getKey() + " -> Country: " + entry.getValue());
        }
        
        System.out.println("\nAll Country Codes:");
        System.out.println("==================");
        System.out.println(countries.keySet());
        
        System.out.println("\nAll Country Names:");
        System.out.println("==================");
        System.out.println(countries.values());
    }
}
