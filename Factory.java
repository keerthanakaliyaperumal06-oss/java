import java.util.Scanner;
public class Factory{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float rodsperhour=scan.nextFloat();
        float hoursworked=scan.nextFloat();
        float overtimerods=scan.nextFloat();
        float rejectedrods=scan.nextFloat();

        float finalnumber=(rodsperhour*hoursworked)+overtimerods-rejectedrods;
        System.out.println(finalnumber);
    }
}