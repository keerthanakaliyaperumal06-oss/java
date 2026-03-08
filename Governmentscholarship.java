import java.util.Scanner;
public class Governmentscholarship {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int familyincome=scan.nextInt();
        int percentage=scan.nextInt();
         
        if(familyincome<200000 && percentage>=75){
            System.out.println("scholarship is granted");
        }
        else{
            System.out.println("scholarship is not granted");
        }
        scan.close();
    }
}
