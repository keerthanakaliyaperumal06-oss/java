import java.util.*;
public class Prime
{
	public static int primecount(int n,int count) {
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		        count++;
		    }
		}
		return count;
	}
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int ans=primecount(n,0);
	    if(ans==2){
	        System.out.println("Prime");
	    }
	    else{
	        System.out.println("Not a Prime");
	    }
	}
}

