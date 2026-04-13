package Week7_8.Level1;

import java.util.Scanner;

public class Q2 {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int result = calculateHandshakes(n);
        System.out.println("Maximum handshakes = " + result);
        sc.close();
    }
}
