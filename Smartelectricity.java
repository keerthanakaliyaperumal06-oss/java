import java.util.Scanner;
public class Smartelectricity {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int connectionvalue=scan.nextInt();
        int appliancemask=scan.nextInt();
        if((connectionvalue & appliancemask)!=0){
            System.out.println("active");
        }
        else{
            System.out.println("inactive");
        }
        scan.close();
    }
}
