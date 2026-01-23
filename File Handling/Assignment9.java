import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment9 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                try {
                    if (data.length == 3 && !data[2].isEmpty()) {
                        Integer.parseInt(data[2]);
                        System.out.println(line);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid row: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
