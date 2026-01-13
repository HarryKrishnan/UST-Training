import java.util.HashMap;

public class Assignment8 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        
        employees.put(101, "John Smith");
        employees.put(102, "Sarah Johnson");
        employees.put(103, "Michael Brown");
        employees.put(104, "Emily Davis");
        employees.put(105, "David Wilson");
        
        System.out.println("Employee Database:");
        System.out.println("==================");
        System.out.println("ID\tName");
        System.out.println("--\t----");
        
        for (Integer id : employees.keySet()) {
            System.out.println(id + "\t" + employees.get(id));
        }
        
        System.out.println("\nTotal employees: " + employees.size());
        
        System.out.println("\nRetrieving employee with ID 103:");
        System.out.println("Name: " + employees.get(103));
    }
}
