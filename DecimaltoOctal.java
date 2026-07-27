import java.util.*;
public class DecimaltoOctal
{
   
	public static int dectooct(int n) {
		int oct=0;
		int base=1;
		int r=0;
		while(n>0){
		    r=n%8;
		    oct=oct+(r*base);
		    n=n/8;
		    base=base*10;
	}
	return oct;
}
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int ans=dectooct(a);
    System.out.print(ans);
}
}
