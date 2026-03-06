
import java.util.Scanner;
public class Youtubechannel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float adrevenue=scan.nextFloat();
        float sponsorshipincome=scan.nextFloat();
        float affiliateearnings=scan.nextFloat();
        float platformservicetax=scan.nextFloat();
        float contentproduction=scan.nextFloat();

        float finalmonthlyearnings=adrevenue+sponsorshipincome+affiliateearnings-platformservicetax-contentproduction;
        System.out.println(finalmonthlyearnings);
    }
}
