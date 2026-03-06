import java.util.Scanner;
public class Patientbill{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        float roomcharge=scan.nextFloat();
        int days=scan.nextInt();
        float medicinecost=scan.nextFloat();
        float labfees=scan.nextFloat();
        float insurancecoverage=scan.nextFloat();

        float finalbill=(roomcharge*days)+medicinecost+labfees-insurancecoverage;
        System.out.println(finalbill);
    }
}