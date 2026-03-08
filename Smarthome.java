import java.util.Scanner;
public class Smarthome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int unitsconsumed=scan.nextInt();
        int voltagefluctuation=scan.nextInt();

        if(unitsconsumed>500 || voltagefluctuation==1){
            System.out.println("alert triggered");
        }
        else{
            System.out.println("normal usage");
        }
        scan.close();
    }
}
