import java.util.Scanner;

public class ZSG_82_83 {
    static int N;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rows & Columns: ");
        N = scan.nextInt();

        int A[][] = new int[N][N];
        System.out.println("Matrix 1: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("A[" + i + "][" + j + "] --> " );
                A[i][j] = scan.nextInt();
            }
        }
        UpperTriangle(A);
        LowerTriangle(A);
    }
    private static void UpperTriangle(int[][] A) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i <= j) System.out.print(A[i][j] + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
    private static void LowerTriangle(int[][] A) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i >= j) System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}