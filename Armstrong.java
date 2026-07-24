import java.util.*;
public class Armstrong
{
	public static int noofdigits(int n) {
		int count=0;
	    while(n>0){
		    n=n/10;
		    count++;
		}
		return count;
	}
	public static int power(int a,int b){
	    int power=1;
	    for(int i=1;i<=b;i++){
	        power=power*a;
	    }
	    return power;
	}
	public static int armstrong(int n){
	    int e=noofdigits(n);
	    int sum=0;
	    while(n>0){
	        int b=n%10;
	        int ans=power(b,e);
	        sum=sum+ans;
	        n=n/10;
	    }
	    return sum;
	}
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int val=armstrong(a);
	    if(a==val){
	        System.out.println("armstrong");
	    }
	    else{
	        System.out.println("not a armstrong");
	    }
	   
	   
	    
	    
	}
}
