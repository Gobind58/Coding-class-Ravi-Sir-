package Lecture9;
import java.util.Scanner;
public class method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        even(a,b);
    }
    public static void even(int x,int y){
        if (x>y) {
            System.out.println("The first no is greater");
            
        }else{
            System.out.println("The srecond no is greater");
        }
    }
}
