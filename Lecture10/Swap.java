package Lecture10;

public class Swap {
  
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a; 
        a = b;
        b = temp; 
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void swapUsingBitwise(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b; 
        b = a ^ b;
        a = a ^ b; 
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
