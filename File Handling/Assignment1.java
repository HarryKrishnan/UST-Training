import java.io.FileWriter;
import java.io.IOException;

public class Assignment1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("students.csv")) {
            writer.write("id,name,marks\n");
            writer.write("101,Ravi,78\n");
            writer.write("102,Anita,85\n");
            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
