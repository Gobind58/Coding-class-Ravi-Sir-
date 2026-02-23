package Test;

public class NumberTriangle {
    public static void main(String[] args) {
        int rows = 6;
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int s = rows; s > i; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}