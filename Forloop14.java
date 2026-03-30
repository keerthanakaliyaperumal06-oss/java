
import java.util.Scanner;

public class Forloop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        sc.nextLine(); 

        double totalFines = 0.0;
        int overdueCount = 0;

        for (int i = 0; i < N; i++) {
            String bookType = sc.next();
            int daysLate = sc.nextInt();

            double dailyFine = 0.0;
            double cap = 0.0;

            
            if (bookType.equalsIgnoreCase("Regular")) {
                dailyFine = 0.5;
                cap = 10.0;
            } else if (bookType.equalsIgnoreCase("Reference")) {
                dailyFine = 1.0;
                cap = 20.0;
            } else if (bookType.equalsIgnoreCase("Magazine")) {
                dailyFine = 0.25;
                cap = 5.0;
            }

            double calculatedFine = daysLate * dailyFine;
            double actualFine = Math.min(calculatedFine, cap);
            boolean capApplied = actualFine < calculatedFine;

            if (daysLate > 0) {
                overdueCount++;
            }
            totalFines += actualFine;

           
            System.out.println("Book " + (i + 1) + ": " + bookType);
            System.out.println("Days Late: " + daysLate);
            System.out.println("Daily Fine: $" + dailyFine);
            System.out.println("Calculated Fine: $" + String.format("%.2f", calculatedFine));
            System.out.println("Actual Fine: $" + String.format("%.2f", actualFine));
            System.out.println("Cap Applied: " + (capApplied ? "Yes" : "No"));
            System.out.println();
        }

        
        System.out.println("Total Books: " + N);
        System.out.println("Total Fines Collected: $" + String.format("%.2f", totalFines));
        System.out.println("Books Overdue: " + overdueCount);
        double averageFine = totalFines / N;
        System.out.println("Average Fine: $" + String.format("%.2f", averageFine));

        sc.close();
    }
}
