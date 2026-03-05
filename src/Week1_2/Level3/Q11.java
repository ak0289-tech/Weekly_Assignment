package Week1_2.Level3;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        System.out.print("Enter weight in pound: ");
        weight = sc.nextDouble();
        double kg = weight / 2.2;
        System.out.println("The weight of the person in pound is "+weight+" and in kg is "+kg);
    }
}
