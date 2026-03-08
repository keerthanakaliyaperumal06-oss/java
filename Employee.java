import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int workinghours=scan.nextInt();
        int attendencepercentage=scan.nextInt();
        
        if(workinghours>40 && attendencepercentage>90){
            System.out.println("bonus eligibility");
        }
        else{
            System.out.println("not eligible");
        }
        scan.close();
    }
}
