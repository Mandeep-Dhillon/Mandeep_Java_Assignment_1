/*
 * 4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. 
 * One driver has kept track of several trips by recording the miles driven and gallons used for each tankful. 
 * Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. 
 * The program should calculate and display the miles per gallon obtained for each trip 
 * and print the combined miles per gallon obtained for all trips up to this point. 
 * All averaging calculations should produce floating-point results. Use class Scanner and 
 * sentinel-controlled iteration to obtain the data from the user.
 * 
 import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.println("Enter the miles driven for the trip (-1 to finish):");
            int miles = scanner.nextInt();

            if (miles == -1) {
                break; // Exit the loop if -1 is entered
            }

            System.out.println("Enter the gallons used:");
            int gallons = scanner.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);

            totalMiles += miles;
            totalGallons += gallons;

            double overallMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon for all trips: %.2f\n", overallMPG);
        }

        scanner.close();
    }
}


 */

 import java.util.Scanner;

 public class Chap4_ex417 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
    System.out.println("Enter the number of trips:");
    int numTrips = input.nextInt();
 
    int totalMiles = 0;
    int totalGallons = 0;
 
        for (int i = 1; i <= numTrips; i++) {
        System.out.println("Enter the miles driven for trip " + i + ":");
        int miles = input.nextInt();
 
        System.out.println("Enter the gallons used for trip " + i + ":");
        int gallons = input.nextInt();
 
        double milesPerGallon = (double) miles / gallons;
        System.out.printf("Miles per gallon for trip %d: %.2f\n", i, milesPerGallon);
 
        totalMiles += miles;
        totalGallons += gallons;
    }
 
        if (numTrips > 0) {
        double overallMPG = (double) totalMiles / totalGallons;
        System.out.printf("Overall miles per gallon: %.2f\n", overallMPG);
        } else {
             System.out.println("No data entered.");
         }
 
     input.close();
     
     }
 }
 
