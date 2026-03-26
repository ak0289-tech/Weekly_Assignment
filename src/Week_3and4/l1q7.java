/* Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
 Spring Season is from March 20 to June 20
 */
import java.util.*;
public class l1q7 {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter Month Value (Jan=1,Feb=2...) : ");
            int month=sc.nextInt();
            System.out.print("Enter Date : ");
            int date=sc.nextInt();
            if((month==3 && date>=20) || (month==4) || (month==5) || (month==6 && date<=20))
                System.out.println("Its a Spring Season !");
            else
                System.out.println("Not a Spring Season !");
        }
    }
}
