import java.util.Scanner;
public class Scholarship{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the tuitionfee:");
        float tuitionfee=scan.nextFloat();

        System.out.print("Enter the scholarship:");
        float scholarship=scan.nextFloat();
        scholarship=tuitionfee-(tuitionfee*scholarship/100);

        System.out.print("Enter the examfee:");
        float examfee=scan.nextFloat();

        System.out.print("Enter the libraryfee:");
        float libraryfee=scan.nextFloat();

        float homesalary=scholarship+examfee+libraryfee;
        System.out.println(homesalary);


    }
}
