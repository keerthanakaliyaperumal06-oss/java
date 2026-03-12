
import java.util.Scanner;

public class Conditional10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeOfDay = sc.nextLine();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine();
        String rateTier = sc.nextLine();

        double baseRate = 0;
        double multiplier = 1;
        double renewableCredit = 0;
        double totalCost = 0;
        double potentialSavings = 0;
        String recommendation = "";
        if(rateTier.equals("Basic")) {
            baseRate = 0.18;
        } 
        else if(rateTier.equals("Time-of-Use")) {
            baseRate = 0.15;
        } 
        else if(rateTier.equals("Premium-Green")) {
            baseRate = 0.12;
        }
        if(timeOfDay.equals("Peak")) {
            if(rateTier.equals("Time-of-Use"))
                multiplier = 1.8;
            else if(rateTier.equals("Premium-Green"))
                multiplier = 1.5;
            else
                multiplier = 1.2;
        } 
        else if(timeOfDay.equals("Off-Peak")) {
            if(rateTier.equals("Time-of-Use"))
                multiplier = 0.8;
            else
                multiplier = 1.0;
        } 
        else if(timeOfDay.equals("Super-Off-Peak")) {
            multiplier = 0.6;
        }
        double baseCost = powerConsumption * baseRate * multiplier;
        renewableCredit = (powerConsumption * baseRate) * (renewablePercentage / 100.0);

        totalCost = baseCost - renewableCredit;
        if(totalCost < 0) {
            totalCost = 0;
        }
        if(timeOfDay.equals("Peak")) {
            if(rateTier.equals("Time-of-Use")) {
                recommendation = "Shift high-power appliances to Off-Peak hours";
                potentialSavings = powerConsumption * baseRate * (1.8 - 1.2);
            } 
            else if(rateTier.equals("Premium-Green")) {
                recommendation = "Great renewable usage! Minor peak reduction possible";
                potentialSavings = powerConsumption * baseRate * 0.2;
            }
        } 
        else if(timeOfDay.equals("Off-Peak")) {
            if(rateTier.equals("Basic")) {
                recommendation = "Consider upgrading to Time-of-Use plan";
                potentialSavings = powerConsumption * 0.03;
            } 
            else if(rateTier.equals("Time-of-Use")) {
                recommendation = "Good timing! Consider increasing renewable capacity";
                potentialSavings = 0.0;
            }
        } 
        else if(timeOfDay.equals("Super-Off-Peak")) {
            recommendation = "Excellent! Maximize appliance use during this period";
            potentialSavings = 0.0;
        }
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.printf("Base Rate: $%.2f/kWh\n", baseRate);
        System.out.println("Rate Multiplier: " + multiplier + "x");
        System.out.printf("Renewable Credit: $%.2f\n", renewableCredit);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.printf("Potential Savings: $%.2f\n", potentialSavings);
    }
}