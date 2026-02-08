
import java.util.Scanner;
public class paternusingwhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int j=1;
            while(j<=n){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            row++;
        }
    }
}
 