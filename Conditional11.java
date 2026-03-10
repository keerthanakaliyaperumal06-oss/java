import java.util.Scanner;

public class Conditional11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();

        int baseDiscount = 0;
        int timeAdjustment = 0;
        double serviceFee = 0;
        String priority = "";
        int prepTime = 0;
        if (loyaltyStatus.equals("Gold")) {
            baseDiscount = 15;
        } 
        else if (loyaltyStatus.equals("Silver")) {
            baseDiscount = 10;
        } 
        else if (loyaltyStatus.equals("Bronze")) {
            baseDiscount = 5;
        } 
        else {
            baseDiscount = 0;
        }
        if (timeSlot.equals("Late-Night")) {
            timeAdjustment = -5;
        } 
        else {
            timeAdjustment = 0;
        }
        if (orderType.equals("Delivery")) {
            serviceFee = orderValue * 0.10;
        } 
        else if (orderType.equals("Takeout")) {
            serviceFee = orderValue * 0.03;
        } 
        else {
            serviceFee = 0;
        }
        double discountAmount = orderValue * baseDiscount / 100.0;
        double adjustedValue = orderValue - discountAmount;
        if (timeAdjustment != 0) {
            adjustedValue = adjustedValue + (adjustedValue * (-timeAdjustment) / 100.0);
        }

        double finalAmount = adjustedValue + serviceFee;

        // Kitchen priority using nested conditions
        if (timeSlot.equals("Peak")) {
            priority = "High";
            if (orderType.equals("Delivery")) {
                prepTime = 25;
            } else {
                prepTime = 30;
            }
        } 
        else if (timeSlot.equals("Regular")) {
            priority = "Medium";
            if (orderValue > 100) {
                prepTime = 25;
            } else {
                prepTime = 20;
            }
        } 
        else {
            priority = "Low";
            prepTime = 15;
        }

        // Output
        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyaltyStatus);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");
    }
}