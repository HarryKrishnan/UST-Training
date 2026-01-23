package java_pack_sec_5;

import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str;
        int count = 0;

        System.out.println("Enter the String: ");
        str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        count = count + 1; // spaces + 1 = words

        System.out.println("Word count: " + count);
    }
}
