import java.util.Scanner;
public class Digitalsignal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int signalvalue=scan.nextInt();
        int togglemask=scan.nextInt();
        int signalstate=signalvalue^togglemask;

        System.out.println(signalstate);
    }
}
