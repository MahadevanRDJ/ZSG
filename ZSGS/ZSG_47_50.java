import java.util.Scanner;

public class ZSG_47_50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        // Pyramid(n);
        System.out.println();
        Pyramid2(n);
        System.out.println();
        // InvertedPyramid(n);
        System.out.println();
        // InvertedPyramid2(n);
    }
    private static void Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n ; j++) System.out.print("  ");
            for (int j = 0; j < i * 2 - 1; j++) {
                if(j < i) System.out.print((j + 1) + " ");
                else System.out.print((i * 2 - j - 1) + " ");
            }
            System.out.println();
        }
    }
    private static void Pyramid2(int n) {
        
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 0; j < n - i; j++) System.out.print("  ");
            for (int j = 0; j < i * 2 - 1; j++) {
                if(j < i) System.out.print((n - i + 1 + j) + " ");
                else System.out.print( n - k++ + " ");
            }
            System.out.println();
        }        
    }
    private static void InvertedPyramid(int n) {
        for (int i = 0; i <  n; i++) {
            for (int j = 0; j <= i; j++) System.out.print(" ");
            for (int k = 0; k < n - i; k++) System.out.print( "* ");
            System.out.println();
        }
        
    }
    private static void InvertedPyramid2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) System.out.print(" ");
            for (int k = 0; k < n - i; k++) System.out.print( n - i + " ");
            System.out.println();
        }
    }
}
