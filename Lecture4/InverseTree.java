import java.util.Scanner;
public class InverseTree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            // spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print("-");
            }
            //stars
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
