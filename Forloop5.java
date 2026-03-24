 import java.util.Scanner;

public class Forloop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  
        sc.nextLine(); 

        double sumOccupancyRates = 0;
        int fullCapacityDays = 0;
        double peakRate = -1;
        int peakDay = -1;

        for (int i = 0; i < N; i++) {
            int day = sc.nextInt();
            int roomsOccupied = sc.nextInt();
            int totalRooms = sc.nextInt();

            double occupancyRate = ((double) roomsOccupied / totalRooms) * 100;
            sumOccupancyRates += occupancyRate;

            String status;
            if (occupancyRate == 100.0) {
                status = "Full";
                fullCapacityDays++;
            } else if (occupancyRate >= 80.0) {
                status = "High";
            } else if (occupancyRate >= 60.0) {
                status = "Moderate";
            } else {
                status = "Low";
            }

            if (occupancyRate > peakRate) {
                peakRate = occupancyRate;
                peakDay = day;
            }

           
            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + roomsOccupied);
            System.out.println("Total Rooms: " + totalRooms);
            System.out.println("Occupancy Rate: " + String.format("%.2f", occupancyRate) + "%");
            System.out.println("Status: " + status);
            System.out.println();
        }

        double averageRate = sumOccupancyRates / N;

        
        System.out.println("Total Days Analyzed: " + N);
        System.out.println("Average Occupancy Rate: " + String.format("%.2f", averageRate) + "%");
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + fullCapacityDays);

        sc.close();
    }
}