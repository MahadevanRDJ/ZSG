import java.util.Scanner;

public class ZSG_80 {
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
        Sparse(A);
    }
    private static void Sparse(int[][] A) {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(A[i][j] == 0) count++;
            }
        }
        if(count > (rows * cols) / 2) System.out.println("Sparse Matrix.");
        else System.out.println("Not a Sparse Matrix.");
    }
}