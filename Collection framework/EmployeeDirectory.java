import java.util.HashMap;

public class EmployeeDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        
        employees.put(101, "John Smith");
        employees.put(102, "Sarah Johnson");
        employees.put(103, "Michael Brown");
        
        System.out.println("Employee ID 101: " + employees.get(101));
        System.out.println("Employee ID 102: " + employees.get(102));
        System.out.println("Employee ID 103: " + employees.get(103));
    }
}
