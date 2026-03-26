//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
import java.util.*;
public class l3q1
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int year;
            System.out.print("Enter Year: ");
            year=sc.nextInt();
            if(year>=1582)
            {
                if((year%4==0 && year%100!=0) || year%400==0)
                    System.out.println(year+" is a Leap Year.");
                else
                    System.out.println(year+" is not a Leap Year.");
            }
        }
    }
}