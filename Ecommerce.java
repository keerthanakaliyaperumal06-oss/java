import java.util.Scanner;
public class Ecommerce {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int cartvalue=scan.nextInt();
        int premiummember=scan.nextInt();

        if(cartvalue>999 || premiummember==1){
            System.out.println("free shipping");
        }
        else{
            System.out.println("shipping charges applied");
        }
        scan.close();
    }
}
