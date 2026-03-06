import java.util.Scanner;
public class Cinema{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        float ticketrevenue=scan.nextFloat();
        float snackrevenue=scan.nextFloat();
        float maintanence=scan.nextFloat();
        float electricity=scan.nextFloat();

        float dailyprofit=ticketrevenue+snackrevenue-maintanence-electricity;
        System.out.println(dailyprofit);
    }
}