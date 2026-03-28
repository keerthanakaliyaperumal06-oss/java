
import java.util.Scanner;

public class Forloop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        sc.nextLine();

        double totalRevenue = 0.0;
        int peakHourVehicles = 0;

        
        for (int i = 1; i <= N; i++) {
            String vehicleType = sc.next();
            double hoursParked = sc.nextDouble();

            double hourlyRate = 0.0;
            double dailyCap = 0.0;

            
            switch (vehicleType) {
                case "Car": hourlyRate = 3.0; dailyCap = 30.0; break;
                case "Motorcycle": hourlyRate = 2.0; dailyCap = 20.0; break;
                case "Truck": hourlyRate = 5.0; dailyCap = 60.0; break;
                case "Bus": hourlyRate = 7.0; dailyCap = 100.0; break;
            }

            double fee = hoursParked * hourlyRate;
            boolean capApplied = false;

            if (fee > dailyCap) {
                fee = dailyCap;
                capApplied = true;
            }

            if (hoursParked > 8.0) {
                peakHourVehicles++;
            }

           
            System.out.println("Vehicle " + i + ": " + vehicleType);
            System.out.println("Hours Parked: " + hoursParked);
            System.out.println("Hourly Rate: $" + hourlyRate);
            System.out.println("Parking Fee: $" + fee);
            System.out.println("Cap Applied: " + (capApplied ? "Yes" : "No"));
            System.out.println();

            totalRevenue += fee;
        }

        
        double averageFee = totalRevenue / N;

        
        System.out.println("Total Vehicles: " + N);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fee: $" + String.format("%.2f", averageFee));
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakHourVehicles);

        sc.close();
    }
}

