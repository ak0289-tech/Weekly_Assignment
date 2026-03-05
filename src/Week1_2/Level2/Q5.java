package Week1_2.Level2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice;
        int quantity;
        System.out.print("Enter unit price (INR): ");
        unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}