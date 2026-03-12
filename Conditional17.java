import java.util.Scanner;

public class Conditional17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String cardtier=scan.nextLine();
        String purchasecategory=scan.nextLine();
        double transactionamount=scan.nextDouble();
        scan.nextLine();
        String promotionalstatus=scan.nextLine();

        double basepointsrate=0.0;
        double categorybonus=0.0;
        double tiermultiplier=0.0;
        double promotionalmultiplier=0.0;
        double pointsearned=0.0;
        double equivalentcashvalue=0.0;
        String rewardstier="Premium";

        if(cardtier.equals("Basic")){
            basepointsrate=1.0;
            tiermultiplier=1.0;
            rewardstier="Standard";
        }
        else if(cardtier.equals("Gold")){
            basepointsrate=1.0;
            tiermultiplier=1.25;
            rewardstier="Enhanced";
        }
        else if(cardtier.equals("Platinum")){
            basepointsrate=1.0;
            tiermultiplier=1.5;
            rewardstier="Premium";
        }
        else if(cardtier.equals("Black")){
            basepointsrate=2.0;
            rewardstier="Elite";
        }

        if(purchasecategory.equals("Groceries")){
            categorybonus=2.0;
        }
        else if(purchasecategory.equals("Dining")){
            categorybonus=2.5;
        }
        else if(purchasecategory.equals("Travel")){
            categorybonus=3.0;
        }
        else if(purchasecategory.equals("Gas")){
            categorybonus=2.0;
        }
        else if(purchasecategory.equals("Other")){
            categorybonus=1.0;
        }


        if(promotionalstatus.equals("None")){
            promotionalmultiplier=1.0;
        }
        else if(promotionalstatus.equals("Double-Points")){
            promotionalmultiplier=2.0;
        }
        else if(promotionalstatus.equals("Triple-Points")){
            promotionalmultiplier=3.0;
        }


        pointsearned=transactionamount*basepointsrate*categorybonus*tiermultiplier*promotionalmultiplier;
        equivalentcashvalue=pointsearned*0.01;


        System.out.println("Cardtier:"+cardtier);
        System.out.println("Purchasecategory:"+purchasecategory);
        System.out.println("Transactionamount:"+transactionamount);
        System.out.println("Promotionalstatus:"+promotionalstatus);
        System.out.println("Basepointsrate:"+basepointsrate);
        System.out.println("Categorybonus:"+categorybonus);
        System.out.println("Tiermultiplier:"+tiermultiplier);
        System.out.println("Promotionalmultiplier:"+promotionalmultiplier);
        System.out.println("Pointsearned:"+pointsearned);
        System.out.println("Equivalentcashvalue:"+equivalentcashvalue);
        System.out.println("Rewards:"+rewardstier);

        scan.close();
        
        
    }
}
