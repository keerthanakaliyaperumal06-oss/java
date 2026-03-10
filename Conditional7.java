import java.util.Scanner;

public class Conditional7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int heartRate = sc.nextInt();
        sc.nextLine();
        String bloodPressure = sc.nextLine();
        double temperature = sc.nextDouble();
        sc.nextLine();
        String symptomSeverity = sc.nextLine();
        String[] bp = bloodPressure.split("/");
        int systolic = Integer.parseInt(bp[0]);
        int diastolic = Integer.parseInt(bp[1]);

        String priority = "";
        int waitTime = 0;
        String action = "";
        if (symptomSeverity.equals("Life-Threatening") || 
           heartRate > 140 || 
           systolic >= 180 || 
           temperature >= 103) {

            priority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";
        }
        else if (symptomSeverity.equals("Severe")) {

            priority = "Urgent";
            waitTime = 15;
            action = "Priority Medical Attention";
        }
        else if (symptomSeverity.equals("Moderate")) {

            if (heartRate < 60 || systolic < 100 || temperature < 97) {
                priority = "Urgent";
                waitTime = 20;
                action = "Priority Medical Attention";
            } else {
                priority = "Standard";
                waitTime = 45;
                action = "Standard Examination";
            }
        }
        else if (symptomSeverity.equals("Mild")) {

            priority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Check-up";
        }
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + symptomSeverity);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);
    }
}