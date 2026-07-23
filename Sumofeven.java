import java.util.Scanner;
public class Sumofeven{
    public static int even(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            if(r%2==0){
                sum=sum+r;
            }
            n=n/10;
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int ans=even(a);
        System.out.print(ans);
    }
}