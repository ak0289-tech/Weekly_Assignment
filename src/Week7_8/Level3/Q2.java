package Week7_8.Level3;

import java.util.Scanner;

public class Q2 {
    public static int countDigits(int num) {
        num = Math.abs(num);
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] getDigits(int num) {
        num = Math.abs(num);
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int[] digits = getDigits(num);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == original;
    }

    public static void largestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }

    public static void smallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] digits = Q2.getDigits(num);
        System.out.println("Digit Count = " + Q2.countDigits(num));
        System.out.println("Duck Number = " + Q2.isDuck(digits));
        System.out.println("Armstrong Number = " + Q2.isArmstrong(num));
        Q2.largestTwo(digits);
        Q2.smallestTwo(digits);
        sc.close();
    }
}