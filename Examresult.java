import java.util.Scanner;
public class Examresult {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int theory=scan.nextInt();
        int practical=scan.nextInt();
        int avg=(theory+practical)/2;
        if(theory>=50 && practical>=50 && avg>=60 ){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        scan.close();
    }
}

