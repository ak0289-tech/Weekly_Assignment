//Create a program to check if a number is armstrong or not.
import java.util.*;
public class l3q5
{
    public static void main(String[] agrs)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int i,b,num,dig=0,sum=0;
            System.out.print("Enter the number : ");
            num=sc.nextInt();
            for(i=num;i>0;i/=10)
                dig++;
            for(i=num;i>0;i/=10)
            {
                b=i%10;
                sum+=Math.pow(b,dig);
            }
            if(sum==num)
                System.out.println("Armstrong");
            else
                System.out.println("Not Armstrong");
        }
    }
}