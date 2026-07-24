import java.util.*;
public class Fibonacci1
{
	public static int fibonacci(int n) {
		int f=0;
		int s=1;
		for(int i=0;i<n;i++){
		    int temp=f+s;
		    f=s;
		    s=temp;
		}
		return f;
		}
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int ans=fibonacci(n);
	    System.out.print(ans);
	}
}
