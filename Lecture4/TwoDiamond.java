class TwoDiamond{
    public static void printPattern3(int n) {

        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            int spaces = 2 * (n - i);
            int k = 1;
            while (k <= spaces) {
                System.out.print(" ");
                k++;
            }
            int m = 1;
            while (m <= i) {
                System.out.print("*");
                m++;
            }

            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        printPattern3(9);
        
    }
}