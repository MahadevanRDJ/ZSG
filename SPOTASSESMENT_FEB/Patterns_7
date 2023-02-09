import java.util.Scanner;

public class Patterns_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Patterns_7 pattern = new Patterns_7();
        int A[][] = new int[n][n];
        pattern.form(A, n);
        scanner.close();
    }

    private void form(int A[][], int n) {
        int l = n , a = 0, b = l - 1, i;
        while (true) {
            for (i = a; i <= b; i++) A[a][i] = A[i][a] = A[i][b] = A[b][i] = 1;
            a += 2;
            b -= 2;
            if (a >= b) break;
        }
        A[a][b] = 1;

        for (int[] is : A) {
            for (int integer : is) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
