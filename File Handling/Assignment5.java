import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name to search: ");
        String searchName = scanner.nextLine();
        
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equalsIgnoreCase(searchName)) {
                    System.out.println(line);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Student not found.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
