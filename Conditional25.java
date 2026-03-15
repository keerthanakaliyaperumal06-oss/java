
import java.util.Scanner;

public class Conditional25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        sc.nextLine();
        String internationalUsage = sc.nextLine();
        String deviceType = sc.nextLine();

        String planName = "";
        String planCategory = "";
        double baseCost = 0.0;
        double dataOverage = 0.0;
        double callOverage = 0.0;
        double internationalFee = 0.0;
        double deviceFee = 0.0;
        double savings = 0.0;

       
        if (dataGB <= 2 && callMinutes <= 500) {
            planName = "Basic 2GB";
            baseCost = 25.0;
            planCategory = "Budget";
        } 
        else {
            if (dataGB <= 5 && callMinutes <= 1000) {
                planName = "Standard 5GB";
                baseCost = 40.0;
                planCategory = "Standard";

                if (dataGB > 5) {
                    dataOverage = (dataGB - 5) * 10;
                }
            } 
            else {
                if (dataGB <= 30) {
                    planName = "Premium Unlimited";
                    baseCost = 70.0;
                    planCategory = "Premium";
                } 
                else {
                    planName = "Unlimited Max";
                    baseCost = 90.0;
                    planCategory = "Unlimited";
                }
            }
        }

    
        if (callMinutes > 1000 && planName.equals("Standard 5GB")) {
            callOverage = (callMinutes - 1000) * 0.05;
        }

        
        if (internationalUsage.equals("None")) {
            internationalFee = 0.0;
        } 
        else if (internationalUsage.equals("Light")) {
            internationalFee = 5.0;
        } 
        else if (internationalUsage.equals("Moderate")) {
            internationalFee = 15.0;
        } 
        else if (internationalUsage.equals("Heavy")) {
            internationalFee = 30.0;
        }

        
        if (deviceType.equals("Basic")) {
            deviceFee = 0.0;
        } 
        else if (deviceType.equals("Smartphone")) {
            deviceFee = 10.0;
        } 
        else if (deviceType.equals("Tablet")) {
            deviceFee = 10.0;
        } 
        else if (deviceType.equals("Hotspot")) {
            deviceFee = 20.0;
        }

        
        if (planName.equals("Standard 5GB") && dataGB > 5) {
            savings = 5.0;
        }

        double totalCost = baseCost + dataOverage + callOverage + internationalFee + deviceFee;

        
        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + internationalUsage);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Recommended Plan: " + planName);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalCost);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + planCategory);
    }
}
