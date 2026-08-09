import java.util.*;
public class DectoHex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dectohex(n);
    }
    public static void dectohex(int n){
        String hex="";
        while(n>0){
            
            int r=n%16;
            if(r<10){
                hex=r+hex;
            }
            else{
                char ch=(char)('A'+(r-10));
                hex=ch+hex;
            }
            n=n/16;
        }
        System.out.print(hex);
    }
}