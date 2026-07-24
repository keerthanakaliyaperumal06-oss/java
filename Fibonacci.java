import java.util.*;
public class Fibonacci
{
	public static void main(int n) {
	int f=0;
	int s=1;
	for(int i=1;i<=n;i++){
	    
	    System.out.print(f+" ");
	    int temp=f+s;
	    f=s;
	    s=temp;
	    
	}
	}
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    main(n);
	}
}
