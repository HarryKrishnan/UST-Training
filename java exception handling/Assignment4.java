import java.util.ArrayList;

public class Assignment4 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        
        courses.add("Data Structures");
        courses.add("Algorithms");
        courses.add("Database Management");
        courses.add("Web Development");
        courses.add("Machine Learning");
        
        System.out.println("Course Names:");
        System.out.println("=============");
        
        int count = 1;
        for (String course : courses) {
            System.out.println(count + ". " + course);
            count++;
        }
    }
}
