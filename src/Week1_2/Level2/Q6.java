package Week1_2.Level2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient
                + " and Remainder is " + remainder
                + " of two numbers " + number1 + " and " + number2);
    }
}