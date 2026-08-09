import java.util.*;
public class Longestword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        longestword(s);
    }
    public static void longestword(String s){
        String vowel="";
        
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                vowel=vowel+s.charAt(i);
            }
        }
        int j=vowel.length()-1;
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                System.out.print(vowel.charAt(j));
                j--;
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
    public static boolean vowel(char c){
        return(c=='a' ||c=='e' ||c=='i'||c=='o' ||c=='u' ||
                c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U');
    }
}