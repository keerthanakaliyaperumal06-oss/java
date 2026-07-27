import java.util.*;
public class BinarytoOctal
{
   
	public static int binarytodecimal(int n) {
		int dec=0;
		int base=1;
		int r=0;
		while(n>0){
		    r=n%10;
		    dec=dec+(r*base);
		    n=n/10;
		    base=base*2;
	}
    return dec;
}
public static int decimaltooctal(int dec){
	int oct=0;
	int base1=1;
	while(dec>0){
	    int t=dec%8;
	    oct=oct+(t*base1);
	    dec=dec/8;
	    base1=base1*10;
	}
	return oct;
	}
    
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int dec=binarytodecimal(a);
    int ans=decimaltooctal(dec);
    System.out.print(ans);
}
}
