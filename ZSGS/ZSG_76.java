import java.util.Scanner;

public class ZSG_76 {
    static int rows, cols;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rows: ");
        rows = scan.nextInt();
        System.out.println("Columns: ");
        cols = scan.nextInt();

        int A[][] = new int[rows][cols];
        System.out.println("Matrix 1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "] --> " );
                A[i][j] = scan.nextInt();
            }
        }
        TransposeMatrix(A);
        Display(A);
    }
    private static void TransposeMatrix(int[][] A) {
        int t;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                t = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = t;
            }
        }
    }
    
    private static void Display(int[][] C) {
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) System.out.print(C[i][j] + "\t");
            System.out.println();
        }
        
    }
}