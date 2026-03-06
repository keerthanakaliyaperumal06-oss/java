import java.util.Scanner;
public class Deliveryservice{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int deliveries=scan.nextInt();
        int payout=scan.nextInt();
        int incentive=scan.nextInt();
        float fuelcost=scan.nextFloat();

        float netearnings=(deliveries*payout)+incentive-fuelcost;
        System.out.println(netearnings);
    }
}