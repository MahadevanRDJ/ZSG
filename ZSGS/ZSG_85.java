import java.util.Scanner;

public class ZSG_85 {
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
        SumofRowsAndColumns(A);
    }
    private static void SumofRowsAndColumns(int[][] A) {
        int rs = 0, cs = 0, k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols ; j++) {
                rs += A[i][j];
            }
            System.out.print("\nRow " + (i + 1) + ": " + rs);
            rs = 0; 
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cs += A[j][i];
            }
            System.out.print("\nColumn " + (i + 1) + ": " + cs);
            cs = 0;
        }
    }
}