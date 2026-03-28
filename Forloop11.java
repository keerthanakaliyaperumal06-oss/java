
import java.util.Scanner;

public class Forloop11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        sc.nextLine(); 

        double originalTotal = 0.0;
        double finalTotal = 0.0;

        
        for (int i = 1; i <= N; i++) {
            String seatType = sc.next();
            String customerType = sc.next();

            double basePrice = 0.0;
            switch (seatType) {
                case "Regular": basePrice = 12.0; break;
                case "Premium": basePrice = 18.0; break;
                case "Recliner": basePrice = 25.0; break;
            }

            double discountPercent = 0.0;
            switch (customerType) {
                case "Adult": discountPercent = 0; break;
                case "Child": discountPercent = 30; break;
                case "Senior": discountPercent = 25; break;
            }

            double finalPrice = basePrice * (1 - discountPercent / 100.0);

            
            System.out.println("Ticket " + i + ": " + seatType + " - " + customerType);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: " + discountPercent + "%");
            System.out.println("Final Price: $" + finalPrice);
            System.out.println();

            originalTotal += basePrice;
            finalTotal += finalPrice;
        }

        
        boolean groupDiscountApplied = false;
        if (N >= 5) {
            double groupDiscount = finalTotal * 0.10;
            finalTotal -= groupDiscount;
            groupDiscountApplied = true;
        }

        double totalDiscount = originalTotal - finalTotal;

       
        System.out.println("Total Tickets: " + N);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + (groupDiscountApplied ? "Yes" : "No"));

        sc.close();
    }
}
