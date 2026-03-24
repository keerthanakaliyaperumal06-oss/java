
import java.util.Scanner;

public class Forloop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  
        sc.nextLine();

        double totalSales = 0;
        double totalCommissions = 0;
        String topPerformer = "";
        double highestSales = 0;

        for (int i = 0; i < N; i++) {
            String repName = sc.next();
            double salesAmount = sc.nextDouble();

            double commissionRate;
            if (salesAmount <= 40000) {
                commissionRate = 5;
            } else if (salesAmount <= 80000) {
                commissionRate = 8;
            } else if (salesAmount <= 100000) {
                commissionRate = 10;
            } else if (salesAmount <= 150000) {
                commissionRate = 12;
            } else {
                commissionRate = 15;
            }

            double commissionEarned = salesAmount * (commissionRate / 100);
            double bonus = 0;
            if (salesAmount >= 150000) {
                bonus = 3000;
            } else if (salesAmount >= 100000) {
                bonus = 2000;
            }

            double totalPayout = commissionEarned + bonus;

            
            totalSales += salesAmount;
            totalCommissions += commissionEarned;

           
            if (salesAmount > highestSales) {
                highestSales = salesAmount;
                topPerformer = repName;
            }

           
            System.out.println("Sales Rep: " + repName);
            System.out.println("Sales Amount: $" + salesAmount);
            System.out.println("Commission Rate: " + commissionRate + "%");
            System.out.println("Commission Earned: $" + commissionEarned);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + totalPayout);
            System.out.println();
        }

       
        System.out.println("Total Sales Reps: " + N);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Commissions: $" + totalCommissions);
        System.out.println("Top Performer: " + topPerformer);

        sc.close();
    }
}