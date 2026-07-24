import java.util.*;
public class Factorial{
public static int factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
}
public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int ans=factorial(a);
    System.out.print(ans);
}
}