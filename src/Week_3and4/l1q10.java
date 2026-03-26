//Write a program to find the sum of numbers until the user enters 0
import java.util.*;
public class l1q10 {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            double num, total=0.0;
            num=sc.nextDouble();
            total+=num;
            while(num!=0)
            {
                num=sc.nextDouble();
                total+=num;
            }
            System.out.println("Total = "+total);
        }
    }
}
