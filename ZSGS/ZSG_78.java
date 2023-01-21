import java.util.Scanner;

public class ZSG_78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rows: ");
        int rows = scan.nextInt();
        System.out.println("Columns: ");
        int cols = scan.nextInt();

        int A[][] = new int[rows][cols];
        System.out.println("Matrix 1: ");
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
        
        MatrixSubtraction(A, B);
    }
    private static void MatrixSubtraction(int[][] A, int[][] B) {
        int C[][] = new int[A.length][A[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = A[i][j] - B[i][j]; 
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
