package Week9_10.Level3;

import java.util.Scanner;

public class Q1 {
    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 40) return "Overweight";
        else return "Obese";
    }

    static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            double bmi = weight / (height * height);
            result[i][0] = weight + "";
            result[i][1] = data[i][1] + "";
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    static void display(String[][] arr) {
        System.out.println("Weight Height BMI Status");
        for (String[] row : arr) {
            System.out.println(String.join("   ", row));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight & height: ");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        display(computeBMI(data));
    }
}
