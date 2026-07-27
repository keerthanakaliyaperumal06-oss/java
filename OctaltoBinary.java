import java.util.*;
public class OctaltoBinary
{
   
	public static int octaltodec(int n) {
		int dec=0;
		int base=1;
		int r=0;
		while(n>0){
		    r=n%10;
		    dec=dec+(r*base);
		    n=n/10;
		    base=base*8;
	}
	int bin=0;
	int base1=1;
	while(dec>0){
	    int t=dec%2;
	    bin=bin+t*base1;
	    dec=dec/2;
	    base1=base1*10;
	}
	return bin;
}
    
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int ans=octaltodec(a);
    System.out.print(ans);
}
}
