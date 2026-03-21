import java.util.Scanner;
public class Hotelroom{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int rooms=scan.nextInt();
        float price=scan.nextFloat();
        float servicecharges=scan.nextFloat();
        float commission=scan.nextFloat();

        float finalrevenue=(rooms*price)+servicecharges-commission;
        System.out.println(finalrevenue);
        scan.close();
    }
}