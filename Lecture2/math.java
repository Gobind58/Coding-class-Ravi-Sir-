import java.util.*;
public class math {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        int y3=sc.nextInt();
        int m1=(y2-y1)/(x2-x1);
        int m2=(y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.println("Straight Line");

        }else{
            System.out.println("Not a Straight Line");
        }

    }
}
