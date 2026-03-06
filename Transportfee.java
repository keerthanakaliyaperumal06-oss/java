import java.util.Scanner;
public class Transportfee{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float distance=scan.nextFloat();
        float rate=scan.nextFloat();
        float maintanence=scan.nextFloat();
        int allowance=scan.nextInt();
        float subsidy=scan.nextFloat();

        float transportfee=(distance*rate)+maintanence+allowance-subsidy;
        System.out.println(transportfee);
    }
}
