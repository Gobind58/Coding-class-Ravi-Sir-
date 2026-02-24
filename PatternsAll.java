import java.util.Scanner;

public class PatternsAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n); 
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
        pattern21(n);
        pattern22(n);
        pattern23(n);
        pattern24(n);
        pattern25(n);
        pattern26(n);
        pattern27(n);
        pattern28(n);
        pattern29(n);
        pattern30(n);
        pattern31(n);
        pattern32(n);
        pattern33(n);
        
        sc.close();
    }
    
    // Pattern 1: Solid square of stars
    public static void pattern1(int n) {
        System.out.println("Pattern 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 2: Hollow square of stars
    public static void pattern2(int n) {
        System.out.println("Pattern 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 3: Right triangle of stars
    public static void pattern3(int n) {
        System.out.println("Pattern 3:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 4: Inverted right triangle of stars
    public static void pattern4(int n) {
        System.out.println("Pattern 4:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 5: Pyramid of stars
    public static void pattern5(int n) {
        System.out.println("Pattern 5:");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 6: Inverted pyramid of stars
    public static void pattern6(int n) {
        System.out.println("Pattern 6:");
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 7: Diamond of stars
    public static void pattern7(int n) {
        System.out.println("Pattern 7:");
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 8: Number pattern - increasing numbers
    public static void pattern8(int n) {
        System.out.println("Pattern 8:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 9: Number pattern - same numbers
    public static void pattern9(int n) {
        System.out.println("Pattern 9:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 10: Floyd's triangle
    public static void pattern10(int n) {
        System.out.println("Pattern 10:");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 11: Binary triangle
    public static void pattern11(int n) {
        System.out.println("Pattern 11:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((i + j) % 2) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 12: Palindrome number pyramid
    public static void pattern12(int n) {
        System.out.println("Pattern 12:");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            // Decreasing numbers
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 13: Pascal's triangle
    public static void pattern13(int n) {
        System.out.println("Pattern 13:");
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" \t");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "\t");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 14: Hollow diamond
    public static void pattern14(int n) {
        System.out.println("Pattern 14:");
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        // Lower half
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 15: Butterfly pattern
    public static void pattern15(int n) {
        System.out.println("Pattern 15:");
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 16: Number pyramid - centered
    public static void pattern16(int n) {
        System.out.println("Pattern 16:");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 17: Decreasing number triangle
    public static void pattern17(int n) {
        System.out.println("Pattern 17:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 18: Mirror number triangle
    public static void pattern18(int n) {
        System.out.println("Pattern 18:");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 19: Zigzag pattern
    public static void pattern19(int n) {
        System.out.println("Pattern 19:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 20: Hourglass pattern
    public static void pattern20(int n) {
        System.out.println("Pattern 20:");
        // Upper half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        // Lower half
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 21: Hollow square with diagonal
    public static void pattern21(int n) {
        System.out.println("Pattern 21:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1 || i == j || i + j == n-1) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 22: Plus sign pattern
    public static void pattern22(int n) {
        System.out.println("Pattern 22:");
        int mid = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 23: X pattern
    public static void pattern23(int n) {
        System.out.println("Pattern 23:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n-1) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 24: Number pattern - 1 2 3 4 5, 1 2 3 4, etc.
    public static void pattern24(int n) {
        System.out.println("Pattern 24:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 25: Number pattern - 5 4 3 2 1, 4 3 2 1, etc.
    public static void pattern25(int n) {
        System.out.println("Pattern 25:");
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 26: Number pyramid - increasing then decreasing
    public static void pattern26(int n) {
        System.out.println("Pattern 26:");
        for (int i = 1; i <= n; i++) {
            // Increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            // Decreasing
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 27: Number pattern from Ques 27
    public static void pattern27(int n) {
        System.out.println("Pattern 27:");
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 28: Number pattern from Ques 28
    public static void pattern28(int n) {
        System.out.println("Pattern 28:");
        for (int i = 1; i <= n; i++) {
            int num = i;
            // Increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            // Decreasing
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + "\t");
                num--;
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 29: Number pattern with zeros
    public static void pattern29(int n) {
        System.out.println("Pattern 29:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t" + 0 + "\t");
            for (int j = 2; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 30: Repeated sequence pattern
    public static void pattern30(int n) {
        System.out.println("Pattern 30:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 31: Number pattern with missing numbers
    public static void pattern31(int n) {
        System.out.println("Pattern 31:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j == i) continue;
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 32: Palindrome pattern
    public static void pattern32(int n) {
        System.out.println("Pattern 32:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Pattern 33: Complex number pattern from Ques 33
    public static void pattern33(int n) {
        System.out.println("Pattern 33:");
        // This is a complex pattern with multiple layers
        // Implementing a simplified version
        int size = n;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size-1-i, size-1-j));
                System.out.print(min + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}