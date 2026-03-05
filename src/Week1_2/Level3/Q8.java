package Week1_2.Level3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate, time;
        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
    }
}