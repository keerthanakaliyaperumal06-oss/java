
import java.util.Scanner;

public class Forloop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int N = sc.nextInt();
        sc.nextLine(); 
        double totalDistance = 0.0;
        double totalRevenue = 0.0;

        for (int i = 0; i < N; i++) {
            double distanceKM = sc.nextDouble();
            String timeOfDay = sc.next();

            double baseFare = 3.0;
            double distanceCharge = distanceKM * 1.0;
            double timeSurcharge = 0.0;

            
            if (timeOfDay.equalsIgnoreCase("Evening")) {
                timeSurcharge = 3.0;
            } else if (timeOfDay.equalsIgnoreCase("Night")) {
                timeSurcharge = 5.0;
            } else {
                timeSurcharge = 0.0; 
            }

            double totalFare = baseFare + distanceCharge + timeSurcharge;

            // Accumulate totals
            totalDistance += distanceKM;
            totalRevenue += totalFare;

            // Print ride details
            System.out.println("Ride " + (i + 1));
            System.out.println("Distance: " + distanceKM + " km");
            System.out.println("Time: " + timeOfDay);
            System.out.println("Base Fare: $" + String.format("%.1f", baseFare));
            System.out.println("Distance Charge: $" + String.format("%.1f", distanceCharge));
            System.out.println("Time Surcharge: $" + String.format("%.1f", timeSurcharge));
            System.out.println("Total Fare: $" + String.format("%.1f", totalFare));
            System.out.println();
        }

        
        System.out.println("Total Rides: " + N);
        System.out.println("Total Distance: " + String.format("%.1f", totalDistance) + " km");
        System.out.println("Total Revenue: $" + String.format("%.1f", totalRevenue));
        double averageFare = totalRevenue / N;
        System.out.println("Average Fare: $" + String.format("%.2f", averageFare));

        sc.close();
    }
}
