import java.util.Scanner;
public class Watersupply {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int residentialunits=scan.nextInt();
        int residentialrate=scan.nextInt();
        int commercialunits=scan.nextInt();
        int commercialrate=scan.nextInt();
        int connectionfees=scan.nextInt();
        int paymentpenalties=scan.nextInt();
        int pipelinemaintenance=scan.nextInt();
        int watertreatmentcosts=scan.nextInt();

        int final_net_revenue=(residentialunits*residentialrate)+(commercialunits*commercialrate)+connectionfees+paymentpenalties-pipelinemaintenance-watertreatmentcosts;
        System.out.println(final_net_revenue);
    }
}
