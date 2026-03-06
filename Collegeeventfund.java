import java.util.Scanner;
public class Collegeeventfund {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float studentregistration=scan.nextFloat();
        float sponsorshipdeals=scan.nextFloat();
        float stallrentals=scan.nextFloat();
        float stagesetup=scan.nextFloat();
        float celebritypayments=scan.nextFloat();
        float marketingcosts=scan.nextFloat();

        float final_remaining_fund=studentregistration+sponsorshipdeals+stallrentals-stagesetup-celebritypayments-marketingcosts;
        System.out.println(final_remaining_fund);
    }
}
