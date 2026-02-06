import java.util.Scanner;
public class Inversepatern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        int star=n;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
            System.out.println();
            space++;
            star--;
            row++;
            space=space+2;
            
        }
        sc.close();
    }
    
}
