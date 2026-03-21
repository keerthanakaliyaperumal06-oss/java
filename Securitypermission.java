import java.util.Scanner;
public class Securitypermission {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int permissionA=scan.nextInt();
        int permissionB=scan.nextInt();
        int finalpermission=permissionA | permissionB;
        System.out.println(finalpermission);
        scan.close();
    }
}
