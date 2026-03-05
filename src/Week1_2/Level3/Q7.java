package Week1_2.Level3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfChocolates, numberOfChildren;
        System.out.print("Enter number of chocolates: ");
        numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        numberOfChildren = sc.nextInt();
        int chocolatesEach = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is "+chocolatesEach+" and the number of remaining chocolates are "+remainingChocolates);
    }
}