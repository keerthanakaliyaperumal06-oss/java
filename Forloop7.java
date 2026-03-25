
import java.util.Scanner;

public class Forloop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  
        sc.nextLine(); 

        int totalUnits = 0;
        double totalRevenue = 0;

        for (int i = 0; i < N; i++) {
            String consumerID = sc.next();
            int unitsConsumed = sc.nextInt();

            double billAmount = calculateBill(unitsConsumed);
            String category;

            if (unitsConsumed <= 200) {
                category = "Low Usage";
            } else if (unitsConsumed <= 300) {
                category = "Medium Usage";
            } else {
                category = "High Usage";
            }

            totalUnits += unitsConsumed;
            totalRevenue += billAmount;

            
            System.out.println("Consumer ID: " + consumerID);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Bill Amount: $" + String.format("%.2f", billAmount));
            System.out.println("Category: " + category);
            System.out.println();
        }

        double averageBill = totalRevenue / N;

        
        System.out.println("Total Consumers: " + N);
        System.out.println("Total Units Consumed: " + totalUnits);
        System.out.println("Total Revenue: $" + String.format("%.2f", totalRevenue));
        System.out.println("Average Bill: $" + String.format("%.2f", averageBill));

        sc.close();
    }

    
    private static double calculateBill(int units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * 0.10;
        } else if (units <= 200) {
            bill = (100 * 0.10) + ((units - 100) * 0.13);
        } else if (units <= 300) {
            bill = (100 * 0.10) + (100 * 0.13) + ((units - 200) * 0.16);
        } else {
            bill = (100 * 0.10) + (100 * 0.13) + (100 * 0.16) + ((units - 300) * 0.20);
        }
        return bill;
    }
}