import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int withdrawalamount=scan.nextInt();
        int accountbalance=scan.nextInt();
        int withdrawallimit=scan.nextInt();

        if(withdrawalamount<=accountbalance && withdrawalamount<=withdrawallimit){
            System.out.println("transaction approved");
        }
        else{
            System.out.println("transaction declined");
        }
        scan.close();
    }
}
