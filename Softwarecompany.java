import java.util.Scanner;
public class Softwarecompany {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float developer_hours=scan.nextFloat();
        float hourlyrate=scan.nextFloat();
        float design_charges=scan.nextFloat();
        float testing_cost=scan.nextFloat();
        float advance_payment=scan.nextFloat();
        
        float final_amount=(developer_hours*hourlyrate)+design_charges+testing_cost-advance_payment;
        System.out.println(final_amount);
        }
}
