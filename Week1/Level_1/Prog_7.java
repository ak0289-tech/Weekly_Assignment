public class Prog_7 {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        double volumeMiles = volumeKm * 0.239913; // conversion factor

        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm + " and cubic miles is " + volumeMiles);
    }
}