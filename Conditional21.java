
import java.util.Scanner;

public class Conditional21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String locationZone = sc.nextLine();
        double parkingHours = Double.parseDouble(sc.nextLine());
        String vehicleType = sc.nextLine();
        String membershipStatus = sc.nextLine();

       
        double baseRate = 5.0;
        double zonePremium = 0.0;
        double vehicleSurcharge = 0.0;
        double membershipDiscount = 0.0;
        double dailyCap = Double.MAX_VALUE;
        String rateCategory = "Standard";

        
        if (locationZone.equalsIgnoreCase("Downtown")) {
            zonePremium = 50.0;
            dailyCap = 150.0;
            rateCategory = "Premium";
        } else if (locationZone.equalsIgnoreCase("Business-District")) {
            zonePremium = 30.0;
            dailyCap = 120.0;
            rateCategory = "Premium";
        } else if (locationZone.equalsIgnoreCase("Residential")) {
            zonePremium = 0.0;
            dailyCap = 60.0;
            rateCategory = "Standard";
        } else if (locationZone.equalsIgnoreCase("Airport")) {
            zonePremium = 100.0;
            dailyCap = 180.0;
            rateCategory = "Luxury";
        }

       
        if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            vehicleSurcharge = -2.0;
        } else if (vehicleType.equalsIgnoreCase("Compact")) {
            vehicleSurcharge = 0.0;
        } else if (vehicleType.equalsIgnoreCase("Sedan")) {
            vehicleSurcharge = 0.0;
        } else if (vehicleType.equalsIgnoreCase("SUV")) {
            vehicleSurcharge = 3.0;
        } else if (vehicleType.equalsIgnoreCase("Oversized")) {
            vehicleSurcharge = 5.0;
        }

        
        if (membershipStatus.equalsIgnoreCase("None")) {
            membershipDiscount = 0.0;
        } else if (membershipStatus.equalsIgnoreCase("Monthly")) {
            membershipDiscount = 20.0;
        } else if (membershipStatus.equalsIgnoreCase("Annual")) {
            membershipDiscount = 25.0;
        } else if (membershipStatus.equalsIgnoreCase("VIP")) {
            membershipDiscount = 30.0;
        }

        
        double hourlyRate = baseRate * (1 + zonePremium / 100.0) + vehicleSurcharge;
        double rawFee = hourlyRate * parkingHours;

        
        double discountedFee = rawFee * (1 - membershipDiscount / 100.0);

        
        boolean dailyCapApplied = false;
        double finalFee = discountedFee;
        if (parkingHours >= 24.0 && discountedFee > dailyCap) {
            finalFee = dailyCap;
            dailyCapApplied = true;
        }

       
        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingHours + " hours");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Base Hourly Rate: $" + baseRate);
        System.out.println("Zone Premium: " + zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vehicleSurcharge);
        System.out.println("Membership Discount: " + membershipDiscount + "%");
        System.out.println("Total Parking Fee: $" + finalFee);
        System.out.println("Daily Cap Applied: " + (dailyCapApplied ? "Yes" : "No"));
        System.out.println("Rate Category: " + rateCategory);

        sc.close();
    }
}