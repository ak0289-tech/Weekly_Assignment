package Week1_2.Level3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, temp;
        System.out.print("Enter first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        number2 = sc.nextInt();
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are "+number1+" and "+number2);
    }
}
