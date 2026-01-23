import java.util.ArrayList;

public class StudentNamesList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        students.add("Eve");
        
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
