
import java.util.Scanner;

public class Conditional9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double annualRevenue = sc.nextDouble();
        sc.nextLine();
        String businessType = sc.nextLine();
        double deductibleExpenses = sc.nextDouble();
        double taxCredits = sc.nextDouble();

        double taxableIncome = annualRevenue - deductibleExpenses;
        int taxRate = 0;
        if (businessType.equals("LLC")) {
            taxRate = 15;
        } 
        else if (businessType.equals("S-Corp")) {
            taxRate = 25;
        } 
        else if (businessType.equals("Partnership")) {
            taxRate = 22;
        } 
        else if (businessType.equals("C-Corp")) {
            if (annualRevenue > 1000000) {
                taxRate = 28;
            } else {
                taxRate = 21;
            }
        }
        double grossTax = taxableIncome * taxRate / 100.0;
        double netTax = grossTax - taxCredits;

        if (netTax < 0) {
            netTax = 0;
        }

        double effectiveTaxRate = (netTax / annualRevenue) * 100;
        System.out.println("Annual Revenue: $" + annualRevenue);
        System.out.println("Business Type: " + businessType);
        System.out.println("Deductible Expenses: $" + deductibleExpenses);
        System.out.println("Tax Credits: $" + taxCredits);
        System.out.println("Taxable Income: $" + taxableIncome);
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Gross Tax: $" + grossTax);
        System.out.println("Net Tax After Credits: $" + netTax);
        System.out.printf("Effective Tax Rate: %.2f%%", effectiveTaxRate);
    }
}