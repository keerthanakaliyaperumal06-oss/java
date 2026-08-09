import java.util.*;
public class Consecutivevowels
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		consecutivevow(s);
	}
	public static void consecutivevow(String s){
	    for(int i=0;i<s.length();i++){
	        if(i>0 && vowel(s.charAt(i)) && vowel(s.charAt(i-1))){
	            continue;
	        }
	        System.out.print(s.charAt(i));
	    }
	}
	public static boolean vowel(char c){
	    return (c=='a' ||c=='e' || c=='i' ||c=='u' ||c=='o' ||
	            c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U');
	}
}

