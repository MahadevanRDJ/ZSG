import java.util.Scanner;

public class ZSG_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Dimension : "); // Square Matrix, thus no. of rows must be equal to no. of columns.
        int n = scan.nextInt();                         // Get the user input for row or column.

        int A[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + " --> ");
                A[i][j] = scan.nextInt();
            }
        }
        scan.close();
        LeftRotate(A);
    }
    private static void LeftRotate(int[][] A) {
        //For the Left Rotation, first transpose it.
        Transpose(A);
        for (int i = 0; i < A.length; i++) {
            int l = 0, h = A.length - 1, t;
            while(l < h) {
                t = A[l][i];
                A[l][i] = A[h][i];
                A[h][i] = t;
                l++; h--;
            }
        }
        System.out.println("Left Rotated :");
        Print(A);
    }
    private static void Transpose(int[][] A) {
        int t;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                t = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = t;
            }
        }
    }
    private static void Print(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
