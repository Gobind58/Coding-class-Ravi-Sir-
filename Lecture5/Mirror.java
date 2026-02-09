package Lecture5;
import java.util.Scanner;

public class Mirror {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row =1;
        int star=1;
        while(row<=2*n-1){
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
                
            }
            if(row<n){
                    star++;

                }else{
                    star--;
                }
            System.out.println();
            row++;
        }
    }
}
