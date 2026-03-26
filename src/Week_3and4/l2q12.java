//Create a program to find the power of a number.
import java.util.*;
public class l2q12 {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int i,num,pow,result=1;
            System.out.print("Enter Number : ");
            num=sc.nextInt();
            System.out.print("Enter Power : ");
            pow=sc.nextInt();
            if(num>0 && pow>0)
            {
                for(i=1;i<=pow;i++)
                    result*=num;
                System.out.println("Reuslt : "+result);
            }
        }
    }
}
