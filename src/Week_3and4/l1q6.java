//Write a program to check whether a number is positive, negative, or zero
import java.util.*;
class l1q6
{
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter a number : ");
            float number=sc.nextFloat();
            if(number>0)
                System.out.println("Positive");
            else if(number<0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }
    }
}