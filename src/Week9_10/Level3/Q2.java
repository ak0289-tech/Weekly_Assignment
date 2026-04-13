package Week9_10.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static char[] uniqueChars(String str) {
        int len = findLength(str);
        char[] temp = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[index++] = ch;
        }
        return Arrays.copyOf(temp, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Arrays.toString(uniqueChars(str)));
    }
}
