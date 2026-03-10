import java.util.Scanner;

public class Conditional8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String locationTier = sc.nextLine();
        int squareFootage = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();

        double basePricePerSqFt = 0;
        int ageAdjustment = 0;
        double amenityBonus = 0;
        String marketCategory = "";
        if (locationTier.equals("Prime")) {
            basePricePerSqFt = 400.0;
        } else if (locationTier.equals("Urban")) {
            basePricePerSqFt = 300.0;
        } else if (locationTier.equals("Suburban")) {
            basePricePerSqFt = 180.0;
        } else if (locationTier.equals("Rural")) {
            basePricePerSqFt = 100.0;
        }
        if (propertyAge <= 5) {
            ageAdjustment = 0;
        } else if (propertyAge <= 10) {
            ageAdjustment = -5;
        } else if (propertyAge <= 15) {
            ageAdjustment = -10;
        } else if (propertyAge <= 30) {
            ageAdjustment = -15;
        } else {
            ageAdjustment = -25;
        }
        double baseValue = squareFootage * basePricePerSqFt;
        double adjustedValue = baseValue + (baseValue * ageAdjustment / 100.0);
        if (amenityScore >= 80) {
            amenityBonus = squareFootage * 34;
        } else if (amenityScore >= 70) {
            amenityBonus = squareFootage * 30;
        } else if (amenityScore >= 50) {
            amenityBonus = squareFootage * 18;
        } else {
            amenityBonus = squareFootage * 7.5;
        }

        // Final estimated value
        double estimatedValue = adjustedValue + amenityBonus;

        // Market category
        if (locationTier.equals("Prime") || locationTier.equals("Urban") && amenityScore >= 70) {
            marketCategory = "Hot";
        } else if (locationTier.equals("Suburban")) {
            marketCategory = "Stable";
        } else {
            marketCategory = "Slow";
        }

        // Output
        System.out.println("Location Tier: " + locationTier);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePricePerSqFt);
        System.out.println("Age Adjustment: " + ageAdjustment + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + estimatedValue);
        System.out.println("Market Category: " + marketCategory);
    }
}