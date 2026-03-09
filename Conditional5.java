import java.util.Scanner;

public class Conditional5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double familyIncome = sc.nextDouble();
        int extracurricularScore = sc.nextInt();
        sc.nextLine();
        String scholarshipType = sc.nextLine();

        String eligibility = "Not Eligible";
        String category = "None";
        double awardAmount = 0;

        if (scholarshipType.equals("Merit")) {

            if (gpa >= 3.8) {
                eligibility = "Eligible";
                category = "Full";
                awardAmount = 25000;
            }
            else if (gpa >= 3.5) {
                eligibility = "Eligible";
                category = "Partial";
                awardAmount = 15000;
            }
            else if (gpa >= 3.0) {
                eligibility = "Eligible";
                category = "Minimal";
                awardAmount = 8000;
            }

        }
        else if (scholarshipType.equals("Need-Based")) {

            if (familyIncome <= 30000 && gpa >= 3.0) {
                eligibility = "Eligible";
                category = "Partial";
                awardAmount = 18000;
            }
            else if (familyIncome <= 50000 && gpa >= 2.8) {
                eligibility = "Eligible";
                category = "Minimal";
                awardAmount = 10000;
            }

        }
        else if (scholarshipType.equals("Sports")) {

            if (extracurricularScore >= 80 && gpa >= 2.5) {
                eligibility = "Eligible";
                category = "Full";
                awardAmount = 20000;
            }
            else if (extracurricularScore >= 60 && gpa >= 2.0) {
                eligibility = "Eligible";
                category = "Partial";
                awardAmount = 12000;
            }

        }

        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + familyIncome);
        System.out.println("Extracurricular Score: " + extracurricularScore);
        System.out.println("Scholarship Type: " + scholarshipType);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Award Amount: $" + awardAmount);
        System.out.println("Award Category: " + category);

        sc.close();
    }
}