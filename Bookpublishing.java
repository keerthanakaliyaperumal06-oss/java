import java.util.Scanner;
public class Bookpublishing {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int number_of_copies=scan.nextInt();
        int costpercopy=scan.nextInt();
        int editing=scan.nextInt();
        int coverdesign=scan.nextInt();
        int distributorcommission=scan.nextInt();
        int marketingexpenses=scan.nextInt();

        int finalprofit=(number_of_copies*costpercopy)+editing+coverdesign-distributorcommission-marketingexpenses;
        System.out.println(finalprofit);
    }
}
 