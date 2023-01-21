import java.util.Scanner;

public class ZSG_79 {
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
        Identity(A);
    }
    private static void Identity(int[][] A) {
        int f = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j && A[i][j] != 1) {
                    f = 0; break;
                }
                if( i != j && A[i][j] != 0) {
                    f = 0; break;
                }
            }
        }
        if(f == 1) System.out.println("Identity Matrix.");
        else System.out.println("Not a Identity Matrix.");
    }
}