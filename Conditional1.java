
import java.util.Scanner;

public class Conditional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int performanceRating = sc.nextInt();
        int yearsOfService = sc.nextInt();
        String departmentType = sc.next();
        double baseSalary = sc.nextDouble();

        double bonusPercentage = 0;
        double bonusAmount = 0;
        String status = "Not Eligible";

        if (performanceRating == 5) {
            status = "Eligible";
            if (departmentType.equals("Critical")) {
                bonusPercentage = 25;
            } else {
                bonusPercentage = 20;
            }
        } 
        else if (performanceRating == 4) {
            status = "Eligible";
            if (departmentType.equals("Critical")) {
                bonusPercentage = 18;
            } else {
                bonusPercentage = 15;
            }
        } 
        else if (performanceRating == 3) {
            status = "Eligible";
            if (yearsOfService >= 2) {
                bonusPercentage = 8;
            } else {
                bonusPercentage = 5;
            }
        } 
        else {
            status = "Not Eligible";
        }

        bonusAmount = (baseSalary * bonusPercentage) / 100;

        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Department: " + departmentType);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Bonus Amount: $" + bonusAmount);
        System.out.println("Status: " + status);

        sc.close();
    }
}