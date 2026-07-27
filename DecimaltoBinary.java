import java.util.*;
public class DecimaltoBinary
{
	public static int dectobin(int n) {
		int bin=0;
		int base=1;
		while(n>0){
		    int r=n%2;
		    bin=bin+r*base;
		    n=n/2;
		    base=base*10;
	}
	return bin;
}
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int ans=dectobin(a);
    System.out.print(ans);
}
}
