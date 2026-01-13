import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment7 {
    public static void main(String[] args) {
        int totalMarks = 0;
        int count = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                totalMarks += Integer.parseInt(data[2]);
                count++;
            }
            double average = (double) totalMarks / count;
            System.out.println("Average marks: " + average);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
