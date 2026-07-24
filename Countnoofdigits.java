import java.util.*;
public class Countnoofdigits
{
	public static int noofdigits(int n) {
		int count=0;
	    while(n>0){
		    n=n/10;
		    count++;
		}
		return count;
	}
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int ans=noofdigits(a);
	    System.out.print(ans);
	}
}
