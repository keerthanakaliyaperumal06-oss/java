import java.util.Scanner;
public class Railway{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float genpass=scan.nextFloat();
        float genfare=scan.nextFloat();
        float acpass=scan.nextFloat();
        float acfare=scan.nextFloat();
        float platform=scan.nextFloat();
        float maintenance=scan.nextFloat();
        float fuel=scan.nextFloat();

        float final_net_revenue=(genpass*genfare)+(acpass*acfare)+platform-maintenance-fuel;
        System.out.println(final_net_revenue);
    }
}