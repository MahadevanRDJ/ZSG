import java.util.Scanner;

public class ZSG_81 {
    static int rows, cols;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rows: ");
        rows = scan.nextInt();
        System.out.println("Columns: ");
        cols = scan.nextInt();

        int A[][] = new int[rows][cols];
        System.out.println("Matrix 1: ");
        if(rows == cols) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    System.out.print("A[" + i + "][" + j + "] --> " );
                    A[i][j] = scan.nextInt();
                }
            }
            int B[][] = new int[rows][cols];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    System.out.print("B[" + i + "][" + j + "] --> " );
                    B[i][j] = scan.nextInt();
                }
            }
            MatrixEquals(A, B);
        }
        else System.out.println("Rows and Columns should be eqaul.");
    }
    private static void MatrixEquals(int[][] A, int[][] B) {
        int f = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(A[i][j] != B[i][j]) f = 0; break; 
            }
        }
        if(f == 1) System.out.println("Matrices are Equal");
        else System.out.println("Matrices are not equal.");
    }
}
