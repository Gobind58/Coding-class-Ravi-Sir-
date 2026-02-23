package Test;
import java.util.Scanner;
public class factorial {
    public static int factorialno(int n){
        if(n==0){
            return 1;
            
        }else{
            return n*factorialno(n-1);
        }
        
    }
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int ans=factorialno(n);
            System.out.println(ans);
}
