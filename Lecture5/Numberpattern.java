package Lecture5;
import java.util.Scanner;
public class Numberpattern {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int i=1;
        while(i<n){
            int j=1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print(i);
                k++;
            }
            System.out.println();
            space--;
            star=star+2;
            i++;

        }


    }
}

