import java.util.*;
public class Counttheevenelements {
    public static int counttheeven(int arr[],int n){
         int count=0;
         for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
         }
         return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
       }
       System.out.print(counttheeven(arr,n));
    }
}


    
