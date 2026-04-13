package Week9_10.Level1;

import java.util.Scanner;

public class Q5 {
    public static void generateException(String str) {
        System.out.println("Generating Exception...");
        System.out.println(str.charAt(str.length())); // invalid index
    }

    public static void handleException(String str) {
        try {
            System.out.println("Handling Exception...");
            System.out.println(str.charAt(str.length())); // invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        handleException(str);
        sc.close();
    }
}
