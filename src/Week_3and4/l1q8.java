//Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
import java.util.*;
import java.util.concurrent.TimeUnit;
public class l1q8 {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the Coutdown Start Point : ");
            int counter=sc.nextInt();
            while(counter>0)
            {
                System.out.println(counter);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                counter--;
            }
        }
    }
}
