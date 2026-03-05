package Week1_2.Level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height;
        System.out.print("Enter base in cm: ");
        base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double baseIn = base / 2.54;
        double heightIn = height / 2.54;
        double areaIn = 0.5 * baseIn * heightIn;
        System.out.println("The Area of the triangle in sq in is "+areaIn+" and sq cm is "+areaCm);
    }
}
