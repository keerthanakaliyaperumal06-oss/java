
import java.util.Scanner;

public class Conditional15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userCount = sc.nextInt();
        sc.nextLine();
        String licenseType = sc.nextLine();
        String supportLevel = sc.nextLine();
        int contractYears = sc.nextInt();

        double basePrice = 0;
        double supportFee = 0;
        int volumeDiscount = 0;
        int multiYearDiscount = 0;
        if (licenseType.equals("Standard")) {
            basePrice = 60;
        } 
        else if (licenseType.equals("Professional")) {
            basePrice = 120;
        } 
        else if (licenseType.equals("Enterprise")) {
            basePrice = 200;
        }
        if (supportLevel.equals("Basic")) {
            supportFee = 10;
        } 
        else if (supportLevel.equals("Priority")) {
            supportFee = 30;
        } 
        else if (supportLevel.equals("Premium")) {
            supportFee = 80;
        }
        if (userCount <= 50) {
            volumeDiscount = 0;
        } 
        else if (userCount <= 200) {
            volumeDiscount = 15;
        } 
        else if (userCount <= 1000) {
            volumeDiscount = 20;
        } 
        else {
            volumeDiscount = 35;
        }
        if (contractYears == 1) {
            multiYearDiscount = 0;
        } 
        else if (contractYears == 2) {
            multiYearDiscount = 5;
        } 
        else if (contractYears == 3) {
            multiYearDiscount = 10;
        } 
        else if (contractYears == 5) {
            multiYearDiscount = 20;
        }

        double priceAfterVolume = basePrice * (1 - volumeDiscount / 100.0);
        double annualCostPerUser = (priceAfterVolume + supportFee) * (1 - multiYearDiscount / 100.0);

        double totalAnnualCost = annualCostPerUser * userCount;
        double totalContractValue = totalAnnualCost * contractYears;
        String pricingTier;
        if (userCount < 100) {
            pricingTier = "Small Business";
        } 
        else if (userCount < 1000) {
            pricingTier = "Mid-Market";
        } 
        else {
            pricingTier = "Enterprise";
        }

        System.out.println("User Count: " + userCount);
        System.out.println("License Type: " + licenseType);
        System.out.println("Support Level: " + supportLevel);
        System.out.println("Contract Duration: " + contractYears + " years");
        System.out.println("Base Price Per User: $" + basePrice);
        System.out.println("Volume Discount: " + volumeDiscount + "%");
        System.out.println("Support Fee Per User: $" + supportFee);
        System.out.println("Multi-Year Discount: " + multiYearDiscount + "%");
        System.out.println("Annual Cost Per User: $" + annualCostPerUser);
        System.out.println("Total Annual Cost: $" + totalAnnualCost);
        System.out.println("Total Contract Value: $" + totalContractValue);
        System.out.println("Pricing Tier: " + pricingTier);

        sc.close();
    }
}