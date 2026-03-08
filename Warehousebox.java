import java.util.Scanner;
public class Warehousebox {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int baseboxes=scan.nextInt();
        int levels=scan.nextInt();
        int capacity=baseboxes<<levels;

        System.out.println(capacity);
        scan.close();
    }
}
