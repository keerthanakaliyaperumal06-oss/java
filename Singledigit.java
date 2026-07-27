public class Singledigit {
    public static void singledigit(int n){
        int sum=1;
        while(n>0 || sum>9){
            if(n==sum){
                n=sum;
                sum=0;
            }
        }
        
    }
}
