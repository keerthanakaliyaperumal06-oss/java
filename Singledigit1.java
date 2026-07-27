import java.util.*;
public class Singledigit1
{
	public static int sum(int n) {
	   int sum=0;
	   while(n>0){
	       int last=n%10;
	       sum=sum+last;
	       n=n/10;
	   }
	   return sum;
	}
	public static int single(int n){
	    while(n>9){
	        int ans=sum(n);
	        n=ans;
	    }
	    return n;
	}
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int ans=single(a);
	    System.out.print(ans);
	}
}
