import java.util.Scanner;
public class Bankloan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int salary=scan.nextInt();
        int creditscore=scan.nextInt();

        if(salary>25000 && creditscore>700){
            System.out.println("loan approved");
        }
        else{
            System.out.println("loan rejected");
        }
        scan.close();
    }
}
