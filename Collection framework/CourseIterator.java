import java.util.ArrayList;

public class CourseIterator {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        
        courses.add("Mathematics");
        courses.add("Physics");
        courses.add("Chemistry");
        courses.add("Biology");
        courses.add("Computer Science");
        
        for (String course : courses) {
            System.out.println(course);
        }
    }
}
