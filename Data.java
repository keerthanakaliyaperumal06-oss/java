import java.util.Scanner;
public class Data{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the Basecost:");
        float Basecost=scan.nextFloat();

        System.out.print("Enter the ExtraGB:");
        int ExtraGB=scan.nextInt();

        System.out.print("Enter the RateperGB:");
        float RateperGB=scan.nextFloat();

        System.out.print("Enter the Tax:");
        float Tax=scan.nextFloat();

        float Totalbill=(Basecost+(ExtraGB*RateperGB))*(1+Tax/100);
        System.out.println("Totalbill="+Totalbill);


        

    }
}