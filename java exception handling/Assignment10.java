import java.util.HashMap;

public class Assignment10 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        
        employees.put(101, "John Smith");
        employees.put(102, "Sarah Johnson");
        employees.put(103, "Michael Brown");
        employees.put(104, "Emily Davis");
        employees.put(105, "David Wilson");
        
        System.out.println("Original Employee Database:");
        System.out.println("===========================");
        displayEmployees(employees);
        
        System.out.println("\nRemoving employee with ID 103...");
        String removedEmployee = employees.remove(103);
        System.out.println("Removed: " + removedEmployee);
        
        System.out.println("\nUpdated Employee Database:");
        System.out.println("==========================");
        displayEmployees(employees);
    }
    
    private static void displayEmployees(HashMap<Integer, String> employees) {
        System.out.println("ID\tName");
        System.out.println("--\t----");
        for (Integer id : employees.keySet()) {
            System.out.println(id + "\t" + employees.get(id));
        }
        System.out.println("Total employees: " + employees.size());
    }
}
