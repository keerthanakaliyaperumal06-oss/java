import java.util.Scanner;
public class Conditional19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

            String movieformat=scan.nextLine();
            String showtime=scan.nextLine();
            String seatcategory=scan.nextLine();
            String customertype=scan.nextLine();

            double baseticketprice=0.0;
            double formatsurcharge=0.0;
            double seatupgradefee=0.0;
            double timebasedadjustment=0.0;
            double customerdiscount=0.0;
            double finalticketprice=0.0;
            String concessionvoucher=" ";
            String pricingcategory="Value";
        
        
            if(movieformat.equals("2D")){
                baseticketprice=12;
                formatsurcharge=0;
            }
            else if(movieformat.equals("3D")){
                baseticketprice=12;
                formatsurcharge=5;
            }
            else if(movieformat.equals("IMAX")){
                baseticketprice=12;
                formatsurcharge=8;
            }
            else if(movieformat.equals("4DX")){
                baseticketprice=12;
                formatsurcharge=10;
            }


            if(seatcategory.equals("Standard")){
                seatupgradefee=0;
            }
            else if(seatcategory.equals("Premium")){
                seatupgradefee=4;
            }
            else if(seatcategory.equals("Recliner")){
                seatupgradefee=7;
            }


            if(showtime.equals("Matinee")){
                timebasedadjustment=-30;
            }
            else if(showtime.equals("Evening")){
                timebasedadjustment=0;
            }
            else if(showtime.equals("Prime-Time")){
                timebasedadjustment=+20;
            }
            else if(showtime.equals("Late-Night")){
                timebasedadjustment=-20;
            }


            if(customertype.equals("Adult")){
                customerdiscount=0;
                concessionvoucher="No";
            }
            else if(customertype.equals("Senior")){
                customerdiscount=25;
                concessionvoucher="Yes";
            }
            else if(customertype.equals("Student")){
                customerdiscount=15;
                concessionvoucher="Yes";
            }
            else if(customertype.equals("Child")){
                customerdiscount=30;
                concessionvoucher="Yes";
            }

            if(showtime.equals("Matinee") || customertype.equals("Senior") || customertype.equals("Student") || customertype.equals("Child")){
                concessionvoucher="Yes";
            }
            else{
                concessionvoucher="No";
            }

            double basewithsurcharges;
            double adjustedprice;
            basewithsurcharges=baseticketprice+formatsurcharge+seatupgradefee;
            adjustedprice=basewithsurcharges*(1+timebasedadjustment/100);
            finalticketprice=adjustedprice*(1-customerdiscount/100);
            

            if(finalticketprice<10){
                pricingcategory="Value";
            }
            else if(finalticketprice<20){
                pricingcategory="Standard";
            }
            else if(finalticketprice<30){
                pricingcategory="Premium";
            }
            else{
                pricingcategory="Luxury";
            }


            System.out.println("Movieformat:"+movieformat);
            System.out.println("Showtime:"+showtime);
            System.out.println("Seatcategory:"+seatcategory);
            System.out.println("Customertype:"+customertype);
            System.out.println("Baseticketprice:"+baseticketprice);
            System.out.println("Formatsurcharge:"+formatsurcharge);
            System.out.println("Seatupgradefee:"+seatupgradefee);
            System.out.println("Timebasedadjustment:"+timebasedadjustment);
            System.out.println("Customerdiscount:"+customerdiscount);
            System.out.println("Finalticketprice:"+finalticketprice);
            System.out.println("Concessionvoucher:"+concessionvoucher);
            System.out.println("Pricingcategory:"+pricingcategory);

            scan.close();
        }
}
