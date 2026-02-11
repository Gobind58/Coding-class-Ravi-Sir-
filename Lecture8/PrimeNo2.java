package Lecture8;
import java.util.Scanner;
public class PrimeNo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            int prime=1;
            for(int j=2; j<i;j++){
                if(i%j==0){
                    prime=0;
                    break;
                }
            }
            if(prime==1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
