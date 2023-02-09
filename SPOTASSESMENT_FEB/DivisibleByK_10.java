
import java.util.Scanner;

public class DivisibleByK_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DivisibleByK_10 obj = new DivisibleByK_10();
        System.out.println("Enter the no. of elements : ");
        int n = scanner.nextInt();

        System.out.println("Elements :");
        int A[] = new int[n]; 
        for (int i = 0; i < A.length; i++) A[i] = scanner.nextInt();

        System.out.println("Divisor : ");
        int divisor = scanner.nextInt();

        obj.find(A, divisor);
        scanner.close();
    }
    private void find(int A[], int divisor) {
        sort(A);
        for (int i = 0; i < A.length && A[i] < divisor; i++) {
            for (int j = i + 1; j < A.length ; j++) {
                if((A[i] + A[j]) % divisor == 0) {
                    System.out.println("[" + A[i] + ", " + A[j] + "]");
                }
            }
        }
    }
    private void sort(int[] A) {
        int t, j;
        for (int i = 1; i < A.length; i++) {
            t = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > t)
                A[j + 1] = A[j--];
            A[j + 1] = t;
        }
    }
}
