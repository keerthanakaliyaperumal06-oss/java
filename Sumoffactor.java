public import java.util.*;

{
	public static int sumoffactor(int n) {
		int sum=0;
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		    sum=sum+i;
		    }
		}
		return sum;
	}
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int ans=factor(a);
	    System.out.print(ans);
	}
	
}
 