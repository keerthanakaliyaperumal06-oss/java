import java.util.Scanner;
public class Apartmentmaintenance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float maintenance=scan.nextFloat();
        float parkingfees=scan.nextFloat();
        float communityhallbookings=scan.nextFloat();
        float securitysalaries=scan.nextFloat();
        float electricitybills=scan.nextFloat();
        float cleaningcosts=scan.nextFloat();

        float remaining_balance_funds=maintenance+parkingfees+communityhallbookings-securitysalaries-electricitybills-cleaningcosts;
        System.out.println(remaining_balance_funds);
    }
}
