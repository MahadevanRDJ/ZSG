import java.util.Scanner;

public class ThreeRightRotate_6 {
    public static void main(String[] args) {
        ThreeRightRotate_6 obj = new ThreeRightRotate_6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Dimension : ");
        int N = scanner.nextInt();

        int A[][] = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        obj.threeRightRotate(A, N);
    }
    private void threeRightRotate (int [][] A, int N) {
        int [][] temp = new int[A.length][A.length];
        transpose(A, temp);
        A = temp.clone();
        int low, high, t;
        for (int i = 0; i < A.length; i++) {
            low = 0;
            high = N - 1;
            while(low < high) {
                t = A[low][i];
                A[low][i] = A[high][i];
                A[high][i] = t;
                high--;
                low++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void transpose(int [][] A, int [][]temp) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                temp[i][j] = A[j][i];
            }
        }
    }
}
