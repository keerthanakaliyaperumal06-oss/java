import java.util.Scanner;
public class Agriculture{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         
        float yieldperarea=scan.nextFloat();
        float acres=scan.nextFloat();
        float extrayield=scan.nextFloat();
        float damagedcrops=scan.nextFloat();

        float marketableyield=(yieldperarea*acres)+extrayield-damagedcrops;
        System.out.println(marketableyield);
    }
}