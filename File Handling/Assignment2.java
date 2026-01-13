import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
