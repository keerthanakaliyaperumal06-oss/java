import java.util.Scanner;
public class Forloop10 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int N=scan.nextInt();
        int totalitems=0;
        double ordersubtotal=0.0;
        double tax=0.0;
        double servicecharge=0.0;
        double grandtotal=0.0;


        for(int i=0;i<N;i++){
            String item=scan.next();
            double price=scan.nextDouble();
            int quantity=scan.nextInt();
            double itemsubtotal=price*quantity;

            ordersubtotal+=itemsubtotal;
            totalitems+=quantity;

            System.out.println("Item: "+item);
            System.out.println("Price: "+price+"x"+quantity);
           
            System.out.println("Subtotal: "+itemsubtotal);
            System.out.println();
            
        }
        
         tax=ordersubtotal*0.08;
         servicecharge=ordersubtotal*0.10;
         grandtotal=ordersubtotal+tax+servicecharge;


        System.out.println("Totalitems: "+totalitems);
        System.out.println("Subtotal:$ "+ordersubtotal);
        System.out.println("Tax:$ "+tax);
        System.out.println("Servicecharge:$ "+servicecharge);
        System.out.println("Grandtotal:$ "+grandtotal);

        scan.close();


        
    }
}
