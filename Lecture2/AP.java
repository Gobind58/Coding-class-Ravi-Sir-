
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        
        for(int i=1;i<=50;i++){
            System.out.print(a+(i-1)*d + " ");
        }
    }
}
