import java.util.Scanner;

public class Conditional18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        sc.nextLine();
        String zone = sc.nextLine();
        String speed = sc.nextLine();
        String size = sc.nextLine();

        double baseRate = 0;
        double weightSurcharge = 0;
        double zoneMultiplier = 1;
        double sizeSurcharge = 0;
        double totalCost;
        int deliveryDays = 0;
        String serviceLevel = "";
        if(zone.equals("Local")) {
            baseRate = 5.0;
        } else if(zone.equals("Regional")) {
            baseRate = 10.0;
        } else if(zone.equals("National")) {
            baseRate = 25.0;
        } else if(zone.equals("International")) {
            baseRate = 50.0;
        }
        if(weight <= 10) {
            weightSurcharge = weight * 1.0;
        } else {
            weightSurcharge = weight * 2.0;
        }
        if(zone.equals("Local")) {
            zoneMultiplier = 1.0;
        } else if(zone.equals("Regional")) {
            zoneMultiplier = 1.2;
        } else if(zone.equals("National")) {
            zoneMultiplier = 1.5;
        } else if(zone.equals("International")) {
            zoneMultiplier = 3.0;
        }
        if(size.equals("Small")) {
            sizeSurcharge = 0.0;
        } else if(size.equals("Medium")) {
            sizeSurcharge = 5.0;
        } else if(size.equals("Large")) {
            sizeSurcharge = 15.0;
        } else if(size.equals("Oversized")) {
            sizeSurcharge = 30.0;
        }
        if(speed.equals("Economy")) {
            deliveryDays = 7;
            serviceLevel = "Budget";
        } 
        else if(speed.equals("Standard")) {
            deliveryDays = 5;
            serviceLevel = "Standard";
        } 
        else if(speed.equals("Express")) {
            deliveryDays = 2;
            serviceLevel = "Priority";
        } 
        else if(speed.equals("Overnight")) {
            deliveryDays = 1;
            serviceLevel = "Premium";
        }
        totalCost = (baseRate + weightSurcharge + sizeSurcharge) * zoneMultiplier;

        System.out.println("Package Weight: " + weight + " lbs");
        System.out.println("Destination Zone: " + zone);
        System.out.println("Shipping Speed: " + speed);
        System.out.println("Package Size: " + size);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + deliveryDays + " business days");
        System.out.println("Service Level: " + serviceLevel);
    }
}