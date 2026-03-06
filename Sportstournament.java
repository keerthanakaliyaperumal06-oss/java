
import java.util.Scanner;
public class Sportstournament {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int teamregistration=scan.nextInt();
        int broadcastingrights=scan.nextInt();
        int sponsorshipmoney=scan.nextInt();
        int prizedistribution=scan.nextInt();
        int stadiumrent=scan.nextInt();
        int advertisingcosts=scan.nextInt();

        int remainingfunds=teamregistration+broadcastingrights+sponsorshipmoney-prizedistribution-stadiumrent-advertisingcosts;
        System.out.println(remainingfunds);
    }
}
