import java.util.*;
public class Oddeven{
    public static void even(int n){
        for(int i=1;i<n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void odd(int n){
        for(int i=1;i<n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        even(n);
        
    }
}