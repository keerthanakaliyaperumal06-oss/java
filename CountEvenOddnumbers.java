import java.util.*;
public class CountEvenOddnumbers
{
    public static void countEvenOddnumbers(int arr[],int n) {
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
            
        }
        System.out.println("even="+even);
        System.out.println("odd="+odd);
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		countEvenOddnumbers(arr,n);
	}
	
}

