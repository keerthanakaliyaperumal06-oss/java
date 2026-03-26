import java.util.Scanner;
public class Forloop9 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int N=scan.nextInt();
        int totalworkouts=0;
        int totalduration=0;
        int totalcaloriesburned=0;
        double averagecaloriespersession=0.0;
        String fitnesslevel=" ";


        for(int i=1;i<=N;i++){
            String session =scan.next();
            int duration=scan.nextInt();
            int caloriesburned=0;
            String intensity=" ";

            if(session.equals("Running")){
                caloriesburned=duration*10;
                intensity="Highintensity";
            }
            else if(session.equals("Swimming")){
                caloriesburned=duration*12;
                intensity="Highintensity";
            }
            else if(session.equals("Cycling")){
                caloriesburned=duration*8;
                intensity="Moderateintensity";
            }
            else if(session.equals("Gym")){
                caloriesburned=duration*7;
                intensity="Moderateintensity";
            }
            else if(session.equals("Walking")){
                caloriesburned=duration*4;
                intensity="Lowintensity";
            }

            totalduration+=duration;
            totalcaloriesburned+=caloriesburned;
            totalworkouts++;

            System.out.println("Session: "+session);
            System.out.println("Duration: "+duration+"minutes");
            System.out.println("Caloriesburned: "+caloriesburned);
            System.out.println("Intensity: "+intensity);
            System.out.println();
        }
        
        averagecaloriespersession=totalcaloriesburned/totalworkouts;

        
        if(totalcaloriesburned<300){
            fitnesslevel="Beginner";
        }
        else if(totalcaloriesburned<=1000){
            fitnesslevel="Intermediate";
        }
        else if(totalcaloriesburned>1000){
            fitnesslevel="Advanced";
        }

        System.out.println("Totalworkouts: "+totalworkouts);
        System.out.println("Totalduration: "+totalduration);
        System.out.println("Totalcaloriesburned: "+totalcaloriesburned);
        System.out.println("Averagecaloriespersession: "+averagecaloriespersession);
        System.out.println("Fitnesslevel: "+fitnesslevel);
       

        scan.close();
        
    }
}
