package Week1_2.Level2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter;
        System.out.print("Enter the perimeter of the square: ");
        perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}