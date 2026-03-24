import java.util.Scanner;

public class Forloop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); 
        scan.nextLine(); 

        int lowStockCount = 0;
        int criticalCount = 0;
        int totalReorderQuantity = 0;

        for (int i = 0; i < N; i++) {
            String productName = scan.next();
            int currentStock = scan.nextInt();
            int minimumStock = scan.nextInt();

            String status;
            int reorderQuantity = 0;

            if (currentStock >= minimumStock) {
                status = "Adequate";
                reorderQuantity = 0;
            } else if (currentStock >= minimumStock / 2) {
                status = "Low Stock";
                reorderQuantity = (minimumStock - currentStock) + (minimumStock / 2);
                lowStockCount++;
            } else {
                status = "Critical";
                reorderQuantity = (minimumStock - currentStock) + (int)(minimumStock * 1.5);
                criticalCount++;
            }

            totalReorderQuantity += reorderQuantity;

            
            System.out.println("Product: " + productName);
            System.out.println("Current Stock: " + currentStock);
            System.out.println("Minimum Stock: " + minimumStock);
            System.out.println("Status: " + status);
            System.out.println("Reorder Quantity: " + reorderQuantity);
            System.out.println();
        }

       
        System.out.println("Total Products: " + N);
        System.out.println("Low Stock Items: " + lowStockCount);
        System.out.println("Critical Items: " + criticalCount);
        System.out.println("Total Reorder Quantity: " + totalReorderQuantity);

        scan.close();
    }
}