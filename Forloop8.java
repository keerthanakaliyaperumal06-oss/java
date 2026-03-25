import java.util.Scanner;
public class Forloop8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int N=scan.nextInt();
        int totalitems=0;
        double originaltotal=0.0;
        double totaldiscount=0.0;
        double finaltotal=0.0;
        double savings=0.0;
       
        

       for(int i=0;i<N;i++){
        String productname=scan.next();
        double price=scan.nextDouble();
        int quantity=scan.nextInt();
        double discount=0.0;
        double subtotal=0.0;


        if(quantity==1){
            discount=0;
        }
        else if(quantity>=2 && quantity<=4){
            discount=10;
        }
        else if(quantity>=5 && quantity<=9){
            discount=15;
        }
        else if(quantity>=10){
            discount=20;
        }

        double subtotal=price*quantity*(1-discount/100);
        double originaltotal+=price*quantity;
        finaltotal+=subtotal;
        totalitems+=quantity;

        System.out.println("Product: "+productname);
        System.out.println("Unitprice: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Discount:% "+discount);
        System.out.println("Subtotal: "+subtotal);
       }

       totaldiscount=originaltotal-finaltotal;
       savings=(totaldiscount/originaltotal)*100;
       
       System.out.println("Totalitems: "+totalitems);
       System.out.println("Originaltotal: "+originaltotal);
       System.out.println("Totaldiscount: "+totaldiscount);
       System.out.println("Finalttotal: "+finaltotal);
       System.out.println("Savings: "+savings);

       scan.close();

    }
}
