import java.util.ArrayList;

public class WrapperClassDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("Integer values stored:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
