package Test;
import java.util.Scanner;
public class reverse {
    public static int REverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=REverse(n);
        System.out.println(ans);
    }
}
