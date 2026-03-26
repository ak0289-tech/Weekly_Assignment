import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        // Step d: Frequency array of size 10 (digits 0–9)
        int[] frequency = new int[10];

        // Step c: Extract digits and store frequency
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number = number / 10;
        }

        // Step e: Display frequency of each digit
        System.out.println("\nFrequency of digits:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}