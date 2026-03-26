//Write a program to find the sum of n natural numbers using for loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
import java.util.*;
public class l1q13 {
    static int formula(int num)
    {
        int sum=((num)*(num+1))/2;
        System.out.println("Using Formula - n(n+1)/2, Sum = "+sum+"\n");
        return sum;
    }
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
        int i,num,sum=0;
        System.out.print("Enter the Number : ");
        num=sc.nextInt();
        if(num>0)
        {
            for(i=1;i<=num;i++)
                sum+=i;
            System.out.println("Using Loop, Sum = "+sum);
            if(formula(num)==sum)
                System.out.println("Sum using both methods is same !");
        }
        else
            System.out.println("Not a Natural Number!");
        }
    }
}
