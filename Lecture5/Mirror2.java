package Lecture5;
import java.util.Scanner;
public class Mirror2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int row=1;
        while(row<=n){
            space=n-1;
            while(space>=row){
                System.out.print("");
                space--;
            }
            while(star<=row){
                System.out.print("*");
                star++;
            }
            System.out.println();
            row++;
            star=1;
        }
        sc.close();
        
    }
}

