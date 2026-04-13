package Week7_8.Level3;

import java.util.Random;

public class Q1 {
    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }
        System.out.print("Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("\nShortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
        System.out.println("Mean = " + mean(heights));
    }
}
