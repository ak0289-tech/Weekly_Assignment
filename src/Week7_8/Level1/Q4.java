package Week7_8.Level1;

import java.util.Scanner;

public class Q4 {
    public static int checkNumber(int num) {
        return Integer.compare(num, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = checkNumber(num);
        if (result == 1)
            System.out.println("Positive number");
        else if (result == -1)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
        sc.close();
    }
}
