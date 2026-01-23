import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"));
             FileWriter writer = new FileWriter("passed_students.csv")) {
            
            String header = reader.readLine();
            writer.write(header + "\n");
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2]);
                if (marks >= 50) {
                    writer.write(line + "\n");
                }
            }
            System.out.println("Passed students copied to passed_students.csv");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
