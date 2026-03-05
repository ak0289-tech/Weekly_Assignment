package Week1_2.Level3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity;
        double timeFromToVia, timeViaToFinalCity;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter From City: ");
        fromCity = sc.nextLine();
        System.out.print("Enter Via City: ");
        viaCity = sc.nextLine();
        System.out.print("Enter To City: ");
        toCity = sc.nextLine();
        System.out.print("Enter distance from From City to Via City (in km): ");
        fromToVia = sc.nextDouble();
        System.out.print("Enter distance from Via City to Final City (in km): ");
        viaToFinalCity = sc.nextDouble();
        System.out.print("Enter time from From City to Via City (in minutes): ");
        timeFromToVia = sc.nextDouble();
        System.out.print("Enter time from Via City to Final City (in minutes): ");
        timeViaToFinalCity = sc.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by "+name+" from "+fromCity+" to "+toCity+" via "+viaCity+" is "+totalDistance+" km and the Total Time taken is "+totalTime+" minutes");
    }
}
