import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment10 {
    public static void main(String[] args) {
        String topperName = "";
        int maxMarks = -1;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2]);
                if (marks > maxMarks) {
                    maxMarks = marks;
                    topperName = data[1];
                }
            }
            System.out.println("Topper: " + topperName + ", Marks: " + maxMarks);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
