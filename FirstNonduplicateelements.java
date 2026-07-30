import java.util.*;
public class FirstNonduplicateelements
{
	public static void nonduplicateelements(int arr[],int n) {
		
		for(int i=0;i<n;i++){
		    boolean found=false;
		    for(int j=0;j<n;j++){
		        if(i!=j && arr[i]==arr[j]){
		            
		            found=true;
		            break;
		        }
		    }
		    if(!found){
		        System.out.print(arr[i]);
		        return;
		    }
		}
	}
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    nonduplicateelements(arr,n);
	}
}
