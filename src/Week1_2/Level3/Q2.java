package Week1_2.Level3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" celsius");
    }
}
