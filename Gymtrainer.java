import java.util.Scanner;
public class Gymtrainer{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float baseSalary=scan.nextFloat();
        float sessions=scan.nextFloat();
        float paypersession=scan.nextFloat();
        float bonus=scan.nextFloat();
        float maintanence=scan.nextFloat();

        float Salary = baseSalary + (sessions * paypersession) + bonus - maintanence;
        System.out.println(Salary);
    }
}