import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        number = Math.abs(number); // handles negative numbers

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;

            if (index == maxDigit) {
                break;
            }
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.print("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);

        sc.close();
    }
}