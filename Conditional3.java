
import java.util.Scanner;

public class Conditional3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String smokingStatus = sc.nextLine();
        String preExistingConditions = sc.nextLine();
        String coverageTier = sc.nextLine();

        double basePremium = 0;
        double riskSurcharge = 0;
        if (coverageTier.equals("Basic")) {
            basePremium = 200;
        } 
        else if (coverageTier.equals("Standard")) {
            basePremium = 350;
        } 
        else if (coverageTier.equals("Premium")) {
            basePremium = 500;
        }
        if (age > 40) {
            riskSurcharge += 150;

            if (smokingStatus.equals("Smoker")) {
                riskSurcharge += 100;

                if (preExistingConditions.equals("Yes")) {
                    riskSurcharge += 100;
                }
            } 
            else {
                if (preExistingConditions.equals("Yes")) {
                    riskSurcharge += 100;
                }
            }
        } 
        else {
            if (smokingStatus.equals("Smoker")) {
                riskSurcharge += 100;

                if (preExistingConditions.equals("Yes")) {
                    riskSurcharge += 100;
                }
            } 
            else {
                if (preExistingConditions.equals("Yes")) {
                    riskSurcharge += 100;
                }
            }
        }

        double totalPremium = basePremium + riskSurcharge;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExistingConditions);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);

        sc.close();
    }
}