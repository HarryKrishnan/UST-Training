import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment4 {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            reader.readLine();
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("Total number of students: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
