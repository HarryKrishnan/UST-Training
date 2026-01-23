import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2]);
                if (marks > 60) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
