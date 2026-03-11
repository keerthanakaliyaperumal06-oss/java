import java.util.Scanner;
public class Conditional13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String studentstatus=scan.nextLine();
        int credithours=scan.nextInt();
        scan.nextLine();
        String programtype=scan.nextLine();
        String residency=scan.nextLine();

        double basetuitionpercredit=0.0;
        double residencymultiplier=0.0;
        double programfee=0.0;
        double studentactivityfee=0.0;
        double totalregistrationfee=0.0;
        String feecategory="Standard";
//base tution fee
        if(programtype.equals("Undergraduate")){
            basetuitionpercredit=350;
        }
        else if(programtype.equals("Graduate")){
            basetuitionpercredit=550;
        }
        else if(programtype.equals("Professional")){
            basetuitionpercredit=800;
        }
//residency

        if(residency.equals("In-state")){
            residencymultiplier=1.0;
            feecategory="Standard";
        }
        else if(residency.equals("Out-of-state")){
            residencymultiplier=2.5;
            feecategory="Premium";
        }
        else if(residency.equals("International")){
            residencymultiplier=3.0;
            feecategory="Premium";
        }
        else if(residency.equals("Continuing-education")){
            residencymultiplier=1.0;
            feecategory="Reduced";
        }


        if(studentstatus.equals("Full-time")){
            if(programtype.equals("Undergraduate")){
                programfee=500;
            }
            else if(programtype.equals("Graduate")){
                programfee=750;
            }
            else if(programtype.equals("Professional")){
                programfee=1200;
            }
        }
        else if(studentstatus.equals("Part-time")){
            if(programtype.equals("Undergraduate")){
                programfee=300;
            }
            else if(programtype.equals("Graduate")){
                programfee=750;
            }
            else if(programtype.equals("Professional")){
                programfee=900;
            }
        }
        else if(studentstatus.equals("Continuing-education")){
            
                programfee=150;
            
            
        }


        if(studentstatus.equals("Full-time")){
            studentactivityfee=200;
        }
        else if(studentstatus.equals("Part-time")){
            studentactivityfee=100;
        }
        else if(studentstatus.equals("Continuing-education")){
            studentactivityfee=50;
        }


        double tuitioncost;
        tuitioncost=credithours*basetuitionpercredit*residencymultiplier;
        totalregistrationfee=tuitioncost+programfee+studentactivityfee;

        

        System.out.println("Studentstatus:"+studentstatus);
        System.out.println("Credithours:"+credithours);
        System.out.println("Programtype:"+programtype);
        System.out.println("Residency:"+residency);
        System.out.println("Basetuitionpercredit:"+basetuitionpercredit);
        System.out.println("Residencymultiplier:"+residencymultiplier);
        System.out.println("Programfee:"+programfee);
        System.out.println("Studentactivityfee:"+studentactivityfee);
        System.out.println("Totalregistrationfee:"+totalregistrationfee);
        System.out.println("Feecategory:"+feecategory);

        scan.close();
        }
}
