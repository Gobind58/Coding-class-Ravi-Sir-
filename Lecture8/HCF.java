package Lecture8;

public class HCF {

    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        int result = hcf(num1, num2);
        System.out.println("HCF of "+ num1+"and"+num2+"is :" +  result);
    }
}
