package Week9_10.Level2;

import java.util.Scanner;

public class Q1 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // keep accessing
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int customLength = findLength(str);
        int actualLength = str.length();
        System.out.println("Length (without length()) = " + customLength);
        System.out.println("Length (using length()) = " + actualLength);
        sc.close();
    }
}
