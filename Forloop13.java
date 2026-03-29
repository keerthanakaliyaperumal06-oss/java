
import java.util.Scanner;

public class Forloop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        sc.nextLine(); 

        int eligibleCount = 0;
        int rejectedCount = 0;

        for (int i = 0; i < N; i++) {
            String donorName = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();

            boolean eligible = true;
            String reason = "";

            
            if (age < 18) {
                eligible = false;
                reason = "Age below 18 years";
            } else if (age > 65) {
                eligible = false;
                reason = "Age above 65 years";
            } else if (weight < 50.0) {
                eligible = false;
                reason = "Weight below 50 kg";
            } else if (hemoglobin < 12.5) {
                eligible = false;
                reason = "Hemoglobin below 12.5 g/dL";
            }

           
            System.out.println("Donor: " + donorName);
            System.out.println("Age: " + age + " years");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Hemoglobin: " + hemoglobin + " g/dL");

            if (eligible) {
                System.out.println("Status: Eligible\n");
                eligibleCount++;
            } else {
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: " + reason + "\n");
                rejectedCount++;
            }
        }

       
        System.out.println("Total Donors: " + N);
        System.out.println("Eligible Donors: " + eligibleCount);
        System.out.println("Rejected Donors: " + rejectedCount);

        double eligibilityRate = (eligibleCount * 100.0) / N;
        System.out.printf("Eligibility Rate: %.2f%%\n", eligibilityRate);

        sc.close();
    }
}

