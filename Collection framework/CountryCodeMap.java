import java.util.HashMap;
import java.util.Map;

public class CountryCodeMap {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        
        countries.put("US", "United States");
        countries.put("IN", "India");
        countries.put("UK", "United Kingdom");
        
        System.out.println("Country Codes and Names:");
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
