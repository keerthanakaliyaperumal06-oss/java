import java.util.*;
public class Reverseeachword
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		revwords(s);
	}
	public static void revwords(String s){
	    String word="";
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)!=' '){
	            word=s.charAt(i)+word;
	        }
	        else{
	            
	                System.out.print(word + " ");
	                word="";
	            
	        }
	    }
	        
	            System.out.print(word);
	        
	}
}
