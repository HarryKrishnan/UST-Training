import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        
        studentNames.add("Alice Johnson");
        studentNames.add("Bob Smith");
        studentNames.add("Charlie Brown");
        studentNames.add("Diana Prince");
        studentNames.add("Ethan Hunt");
        
        System.out.println("Student Names:");
        System.out.println("==============");
        
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println((i + 1) + ". " + studentNames.get(i));
        }
    }
}
