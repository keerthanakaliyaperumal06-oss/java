
import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtToIncomeRatio = sc.nextDouble();
        sc.nextLine();
        String loanType = sc.nextLine();

        String decision;
        double maxLoanAmount = 0;

        if (creditScore >= 750 && debtToIncomeRatio <= 30) {
            decision = "Approved";

            if (loanType.equals("Home")) {
                maxLoanAmount = annualIncome * 4;
            } 
            else if (loanType.equals("Personal")) {
                maxLoanAmount = annualIncome * 0.5;
            } 
            else if (loanType.equals("Business")) {
                maxLoanAmount = annualIncome * 3;
            }

        } 
        else if (creditScore >= 650 && debtToIncomeRatio <= 45) {
            decision = "Needs Review";
            maxLoanAmount = annualIncome * 0.5;
        } 
        else {
            decision = "Rejected";
            maxLoanAmount = 0;
        }

        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtToIncomeRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoanAmount);

        sc.close();
    }
}