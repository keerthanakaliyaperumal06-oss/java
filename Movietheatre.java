import java.util.Scanner;
public class Movietheatre {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int age=scan.nextInt();
        int idproof=scan.nextInt();

        if(age >=18 && idproof==1){
            System.out.println("entry allowed");
        }
        else{
            System.out.println("entry denied");
        }
        scan.close();
    }
}
