package Lecture10;
import java.util.Scanner;
public class array {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] arr;

    public array() {
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void display(int[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void Target(){
        for (int i = 0; i < n; i++) {
            if (arr[i] == 10) {
                System.out.println("Target found at index: " + i);
                return;
            }
        }
        System.out.println("Target not found");
    }
    public void max(){
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
    public void min(){
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);
    }
    public static void main(String[] args) {
        array a=new array();
        a.display(a.arr);
        a.Target();
        a.max();
        a.min();
    }
   
}
