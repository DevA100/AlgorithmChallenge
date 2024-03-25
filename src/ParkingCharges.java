import java.util.Scanner;

public class ParkingCharges {

    private static double minimumCharge = 2.00;

    private static int minimumTime = 3;

    private static double additionalCharge = 0.50;

    // private int additionalTime = 1;

    private static double maximumCharge = 10.00;

    private static int maximumTime = 24;

    private static int parkingTime;


    // to get user input
    public void setpackingTime(int parkingTime) {

        this.parkingTime = parkingTime;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your PackingTime: ");

        parkingTime = input.nextInt();

        System.out.printf(" This is your charge: %n$%.2f ", parkingCharge());
        System.out.println();

        System.out.printf("Your packing time and charges respectively: %n%d%n$%.2f", parkingTime, parkingCharge());

    }

    public static double parkingCharge() {

        double charges;

        if (parkingTime == minimumTime) {

            charges = minimumCharge;

        } else if (parkingTime >= maximumTime) {

            charges = maximumCharge;

            System.out.println("You've reached the maximum charge for 24 hours.");

        } else  {

            charges = minimumCharge + (parkingTime - minimumTime) * additionalCharge;

        }
//        else {
//            charges = minimumCharge + (parkingTime - minimumTime) * additionalCharge;
//        }
        return charges;

    }


}


