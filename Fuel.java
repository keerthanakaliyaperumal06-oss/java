import java.util.Scanner;
public class Fuel{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the distance:");
        float distance=scan.nextFloat();

        System.out.print("Enter the mileage:");
        float mileage=scan.nextFloat();

        System.out.print("Enter the fuelprice:");
        float fuelprice=scan.nextFloat();
        float fuelrequired=distance/mileage;
        
        float fuelcost=fuelrequired*fuelprice;

        System.out.print("Enter the tollcharge:");
        float tollcharge=scan.nextFloat();

        float totaltripcost=fuelcost+tollcharge;
        System.out.println(totaltripcost);
        
    }
}