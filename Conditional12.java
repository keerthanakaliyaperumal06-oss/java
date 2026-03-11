import java.util.Scanner;
public class Conditional12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int driverage=scan.nextInt();
        scan.nextLine();
        String vehicletype=scan.nextLine();
        String drivingrecord=scan.nextLine();
        String coveragelevel=scan.nextLine();
        
        double basepremium=0.0;
        double agefactor=0;
        double vehicleriskfactor=0.0;
        double recordadjustment=0.0;
        double monthlypremium=0;
        double annualpremium=0;
        String riskcategory="low";

        if(coveragelevel.equals("basic")){
            basepremium=500;
        }
        else if(coveragelevel.equals("standard")){
            basepremium=800;
        }
        else if(coveragelevel.equals("comprehensive")){
            basepremium=1500;
        }


        if(driverage>=16 && driverage<=21){
            agefactor=1.8;
        }
        else if(driverage>=22 && driverage<=25){
            agefactor=1.5;
        }
        else if(driverage>=26 && driverage<=40){
            agefactor=1.0;
        }
        else if(driverage>=41 && driverage<=60){
            agefactor=0.9;
        }
        else if(driverage>=61){
            agefactor=1.1;
        }
    

        if(vehicletype.equals("sedan")){
            vehicleriskfactor=1.0;
            riskcategory="medium";
        }
        else if(vehicletype.equals("SUV")){
            vehicleriskfactor=1.2;
            riskcategory="low";
        }
        else if(vehicletype.equals("sports")){
            vehicleriskfactor=1.5;
            riskcategory=" very high";
        }
        else if(vehicletype.equals("truck")){
            vehicleriskfactor=1.1;
            riskcategory="high";
        }


        if(drivingrecord.equals("clean")){
            recordadjustment=-10;
        
        }
        else if(drivingrecord.equals("minor-violations")){
            recordadjustment=+25;
        }
        else if(drivingrecord.equals("major-violations")){
            recordadjustment=+50;
        }

        double adjustedpremium;

        adjustedpremium=basepremium*agefactor*vehicleriskfactor;
        annualpremium=adjustedpremium*(1+recordadjustment/100);
        monthlypremium=annualpremium/12;

        System.out.println("driverage:"+driverage);
        System.out.println("vehicle type:"+vehicletype);
        System.out.println("driving record:"+drivingrecord);
        System.out.println("coverage level:"+coveragelevel);
        System.out.println("base premium:"+basepremium);
        System.out.println("age factor:"+agefactor);
        System.out.println("vehicle risk factor:"+vehicleriskfactor);
        System.out.println("record adjustment:"+recordadjustment);
        System.out.println("monthly premium:"+monthlypremium);
        System.out.println("annual premium:"+annualpremium);
        System.out.println("risk categry:"+riskcategory);
        
        scan.close();
        

        


    }
}
