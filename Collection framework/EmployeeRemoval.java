import java.util.HashMap;
import java.util.Map;

public class EmployeeRemoval {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        
        employees.put(101, "John Smith");
        employees.put(102, "Sarah Johnson");
        employees.put(103, "Michael Brown");
        
        System.out.println("Before removal: " + employees);
        
        employees.remove(102);
        
        System.out.println("After removal: " + employees);
    }
}
