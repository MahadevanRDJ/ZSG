import java.util.Scanner;

public class ZSG_57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),  k = 1;
        int A[][] = new int[n][n];
        scan.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = k++;
            }
            k = 1;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j || (i + j) == (n - 1)) System.out.print(A[i][j] + " ");
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

    }
}
