import java.util.Scanner;
public class Datacompression {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int filesize=scan.nextInt();
        int compressioncycle=scan.nextInt();
        int compression=filesize>>compressioncycle;

        System.out.println(compression);
    }
}
