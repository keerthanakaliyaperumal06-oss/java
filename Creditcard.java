import java.util.Scanner;

public class Creditcard {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        
        int creditlimit=scan.nextInt();
        int purchaseamount=scan.nextInt();
        int card=scan.nextInt();

        if(purchaseamount<=creditlimit && card!=1){
            System.out.println("approved");
        }
        else{
            System.out.println("not approved");
        }
        scan.close();
    }
    }


