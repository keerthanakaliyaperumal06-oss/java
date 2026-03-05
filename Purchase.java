import java.util.Scanner;
public class Purchase{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the total Sales amount:");
        int Sales=scan.nextInt();

        System.out.print("Enter the Discount:");
        float Discount=scan.nextFloat();
        Discount=Sales-(Sales*Discount/100);

        System.out.print("Enter the Gst:");
        float Gst=scan.nextFloat();
        Gst=Discount*Gst/100;
        
        float Finalrevenue=Discount+Gst;
        System.out.println(Finalrevenue);
    }
}