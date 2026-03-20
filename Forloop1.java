
import java.util.Scanner;

public class Forloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // number of employees
        double totalPayroll = 0.0;

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            double baseSalary = sc.nextDouble();
            int rating = sc.nextInt();

            int incrementPercent = 0;
            if (rating == 5) incrementPercent = 15;
            else if (rating == 4) incrementPercent = 10;
            else if (rating == 3) incrementPercent = 5;
            else if (rating == 2) incrementPercent = 2;
            else incrementPercent = 0;

            double finalSalary = baseSalary * (1 + incrementPercent / 100.0);
            totalPayroll += finalSalary;

            System.out.println("Employee: " + name);
            System.out.println("Base Salary: $" + String.format("%.2f", baseSalary));
            System.out.println("Performance Rating: " + rating);
            System.out.println("Increment: " + incrementPercent + "%");
            System.out.println("Final Salary: $" + String.format("%.2f", finalSalary));
            System.out.println();
        }

        System.out.println("Total Employees Processed: " + N);
        System.out.println("Total Payroll: $" + String.format("%.2f", totalPayroll));
        System.out.println("Average Salary: $" + String.format("%.2f", totalPayroll / N));

        sc.close();
    }
}
