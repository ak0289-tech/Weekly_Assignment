package Week9_10.Level2;

import java.util.Scanner;

public class Q2 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] customSplit(String str) {
        int len = findLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = str.substring(start, len);

        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] result1 = customSplit(text);
        String[] result2 = text.split(" ");
        System.out.println("\nCustom Split:");
        for (String word : result1) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in Split:");
        for (String word : result2) {
            System.out.println(word);
        }
        boolean isSame = compareArrays(result1, result2);
        System.out.println("\nAre both results same? " + isSame);
        sc.close();
    }
}
