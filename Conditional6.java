import java.util.Scanner;

public class Conditional6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookingClass = sc.nextLine();
        int daysUntilDeparture = sc.nextInt();
        double seatAvailability = sc.nextDouble();
        sc.nextLine(); 
        String routeType = sc.nextLine();

        double basePrice = 0;
        double multiplier = 1.0;
        String category = "";
        if (bookingClass.equals("Economy")) {
            if (routeType.equals("Domestic")) {
                basePrice = 200.0;
            } else if (routeType.equals("International-Short")) {
                basePrice = 500.0;
            } else if (routeType.equals("International-Long")) {
                basePrice = 800.0;
            }
        } 
        else if (bookingClass.equals("Business")) {
            if (routeType.equals("Domestic")) {
                basePrice = 600.0;
            } else if (routeType.equals("International-Short")) {
                basePrice = 1500.0;
            } else if (routeType.equals("International-Long")) {
                basePrice = 2500.0;
            }
        } 
        else if (bookingClass.equals("First")) {
            if (routeType.equals("Domestic")) {
                basePrice = 1200.0;
            } else if (routeType.equals("International-Short")) {
                basePrice = 3000.0;
            } else if (routeType.equals("International-Long")) {
                basePrice = 5000.0;
            }
        }
        if (seatAvailability <= 30 || daysUntilDeparture <= 10) {
            multiplier = 1.5;
            category = "High Demand";

            if (seatAvailability <= 20 && daysUntilDeparture <= 7) {
                multiplier = 1.8;
            }
        } 
        else if (seatAvailability <= 60 || daysUntilDeparture <= 30) {
            multiplier = 1.3;
            category = "Moderate";
        } 
        else {
            if (daysUntilDeparture >= 90) {
                multiplier = 0.8;
            } else {
                multiplier = 0.9;
            }
            category = "Low Demand";
        }

        double finalPrice = basePrice * multiplier;
        System.out.println("Booking Class: " + bookingClass);
        System.out.println("Days Until Departure: " + daysUntilDeparture);
        System.out.println("Seat Availability: " + seatAvailability + "%");
        System.out.println("Route Type: " + routeType);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Demand Multiplier: " + multiplier + "x");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Pricing Category: " + category);
    }
}