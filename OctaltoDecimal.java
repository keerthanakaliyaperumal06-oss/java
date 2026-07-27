import java.util.*;
public class OctaltoDecimal
{
   
	public static int octaltodecimal(int n) {
		int dec=0;
		int base=1;
		int r=0;
		while(n>0){
		    r=n%10;
		    dec=dec+(r*base);
		    n=n/10;
		    base=base*8;
	}
	return dec;
}
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int ans=octaltodecimal(a);
    System.out.print(ans);
}
}
