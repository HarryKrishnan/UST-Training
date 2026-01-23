import java.util.LinkedList;

public class NumberLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("LinkedList elements:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
