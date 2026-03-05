import java.util.Scanner;
public class Bill{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the totalbill:");
        int totalbill=scan.nextInt();

        System.out.print("Enter the service:");
        float service=scan.nextFloat();
        service=totalbill*service/100;

        System.out.print("Enter the gst:");
        float gst=scan.nextFloat();
        gst=(totalbill+service)*gst/100;

        System.out.print("Enter the numberofpeople:");
        int numberofpeople=scan.nextInt();

        float amountperperson=(totalbill+service+gst)/numberofpeople;
        System.out.print(amountperperson);
        

        



    }
}
