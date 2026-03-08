import java.util.Scanner;
public class Systemlogin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int username=scan.nextInt();
        int password=scan.nextInt();
        int accountslocked=scan.nextInt();

        if(username==1 && password==1 && accountslocked!=1){
            System.out.println("login success");
        }
        else{
            System.out.println("login failed");
        }
        scan.close();
    }
}
