import java.util.Scanner;
public class Carrental {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int rental_days=scan.nextInt();
        float rent_per_day=scan.nextFloat();
        float late=scan.nextFloat();
        float fuel=scan.nextFloat();
        float maintenance=scan.nextFloat();

        float netprofitpervehicle=(rental_days*rent_per_day)+late-fuel-maintenance;
        System.out.println(netprofitpervehicle);
    }
}
