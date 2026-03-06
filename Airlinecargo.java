
import java.util.Scanner;
public class Airlinecargo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int totalweight=scan.nextInt();
        int rateperkg=scan.nextInt();
        int prioritycargocharges=scan.nextInt();
        int insurancefees=scan.nextInt();
        int charges=scan.nextInt();
        int fuelsurcharges=scan.nextInt();

        int finalcargorevenue=(totalweight*rateperkg)+prioritycargocharges+insurancefees-charges-fuelsurcharges;
        System.out.println(finalcargorevenue);

    }
}
