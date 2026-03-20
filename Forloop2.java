
import java.util.Scanner;

public class Forloop2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        double totalScore = 0.0;
        int highestScore = Integer.MIN_VALUE;
        int passedCount = 0, failedCount = 0;

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            
            String grade;
            if (score >= 85) grade = "A";
            else if (score >= 70) grade = "B";
            else if (score >= 60) grade = "C";
            else if (score >= 50) grade = "D";
            else grade = "F";

            
            String status = (score >= 60) ? "Pass" : "Fail";

            if (status.equals("Pass")) passedCount++;
            else failedCount++;

           
            totalScore += score;
            highestScore = Math.max(highestScore, score);

            
            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + status);
            System.out.println();
        }

        
        double average = totalScore / N;
        System.out.println("Total Students: " + N);
        System.out.println("Class Average: " + String.format("%.2f", average));
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Students Passed: " + passedCount);
        System.out.println("Students Failed: " + failedCount);

        sc.close();
    }
}
