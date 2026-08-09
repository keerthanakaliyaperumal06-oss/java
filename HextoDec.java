import java.util.*;
public class HextoDec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        hextodec(s);
    }
    public static void hextodec(String s){
        int dec=0;
        int base=1;
        for(int i=s.length()-1;i>=0;i--){
            int ascii=0;
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                ascii=ch-'0';
            }
            else{
                ascii=ch-'A'+10;
                
            }
            dec=dec+ascii*base;
            base=base*16;
        }
        System.out.print(dec);
    }
}