package Lecture5;
public class All {
    public static void main(String[] args) {

        int n = 4;

        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println();

       
        for (int i = n; i >= 1; i--) {
            for (int s = n; s > i; s--)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println();

        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println();

        
        for (int i = 1; i <= n; i++) {
            for (int s = n; s > i; s--)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
