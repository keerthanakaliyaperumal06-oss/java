import java.util.Scanner;
public class Salary{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the basic:");
        float basic=scan.nextFloat();

        System.out.print("Enter the HRA:");
        float HRA=scan.nextFloat();

        System.out.print("Enter the bonus:");
        float bonus=scan.nextFloat();

        System.out.print("Enter the salary:");
        float salary=scan.nextFloat();

        System.out.print("Enter the providentfund:");
        float providentfund=scan.nextFloat();

        float homesalary=basic+HRA+bonus-salary-providentfund;
        System.out.println(homesalary);
    }
}