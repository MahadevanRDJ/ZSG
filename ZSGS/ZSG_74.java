import java.util.Scanner;

public class ZSG_74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Row 1: ");
        int row1 = scan.nextInt();
        System.out.println("Column 1: ");
        int col1 = scan.nextInt();

        System.out.println("Row 2: ");
        int row2 = scan.nextInt();
        System.out.println("Column 2: ");
        int col2 = scan.nextInt();
        int A[][] = new int[row1][col1];
        int B[][] = new int[row2][col2];
        if(col1 == row2) {
            
            System.out.println("Matrix 1: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print("A[" + i + "][" + j + "] --> " );
                    A[i][j] = scan.nextInt();
                }
            }
            
            
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print("B[" + i + "][" + j + "] --> " );
                    B[i][j] = scan.nextInt();
                }
            }
        }
        else System.out.println("Invalid Dimensions for Matrices.");
        Display(A);
        System.out.println();
        Display(B);
        System.out.println();
        MatrixMultiplication(A, B);
    }
    private static void MatrixMultiplication(int[][] A, int[][] B) {
        int C[][] = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for(int k = 0; k < B.length; k++)
                    C[i][j] += (A[i][k] * B[k][j]); 
                    // System.out.print(C[i][j] + "\t");
            }
            // System.out.println();
        }

        Display(C);
    }
    private static void Display(int[][] C) {
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) System.out.print(C[i][j] + "\t");
            System.out.println();
        }
        
    }
}
