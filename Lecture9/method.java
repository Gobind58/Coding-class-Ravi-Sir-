package Lecture9;
import java.util.Scanner;
public class method {
    public static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
        System.out.println(add2(a,b));
        sc.close();

    }
    public static int add2(int x,int y){
        return x+y;
    }
}
