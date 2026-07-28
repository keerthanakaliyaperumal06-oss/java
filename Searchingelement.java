import java.util.*;
public class Searchingelement
{
	public static boolean searchingelement(int arr[],int n,int key) {
	  for(int i=0;i<n;i++){
	      if(arr[i]==key){
	          return true;
	      }
	  }
	  return false;
	}
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    int key=s.nextInt();
	    if(searchingelement(arr,n,key)){
	        System.out.println("Found");
	    }
	    else{
	        System.out.println("not found");
	    }
	}
 }

