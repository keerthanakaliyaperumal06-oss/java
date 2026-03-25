
import java.util.Scanner;

public class Forloop6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialBalance = sc.nextDouble();
        int N = sc.nextInt();

        double balance = initialBalance;
        int successCount = 0;
        int failCount = 0;
        double totalWithdrawn = 0;

        for (int i = 1; i <= N; i++) {
            double withdrawalAmount = sc.nextDouble();

            System.out.println("Transaction " + i + ": $" + withdrawalAmount);

            if (withdrawalAmount <= balance) {
                balance -= withdrawalAmount;
                successCount++;
                totalWithdrawn += withdrawalAmount;
                System.out.println("Status: Approved");
                System.out.println("Remaining Balance: $" + balance);
            } else {
                failCount++;
                System.out.println("Status: Denied");
                System.out.println("Reason: Insufficient funds");
                System.out.println("Remaining Balance: $" + balance);
            }
            System.out.println();
        }

        
        System.out.println("Total Transactions: " + N);
        System.out.println("Successful Withdrawals: " + successCount);
        System.out.println("Failed Withdrawals: " + failCount);
        System.out.println("Final Balance: $" + balance);
        System.out.println("Total Withdrawn: $" + totalWithdrawn);

        sc.close();
    }
}