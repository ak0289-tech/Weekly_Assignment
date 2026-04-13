package Week9_10.Level1;

import java.util.Scanner;

public class Q6 {
    public static void generateException(String str) {
        System.out.println("Generating Exception...");
        System.out.println(str.substring(5, 2));
    }

    public static void handleException(String str) {
        try {
            System.out.println("Handling Exception...");
            System.out.println(str.substring(5, 2)); // invalid
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
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
