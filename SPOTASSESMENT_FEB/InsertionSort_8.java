import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_8 {

    public static void main(String[] args) {
        InsertionSort_8 insertionSort = new InsertionSort_8();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scanner.nextInt(), A[] = new int[n];
        for (int i = 0; i < n; i++) A[i] = scanner.nextInt();
        insertionSort.sort(A);
        System.out.println(Arrays.toString(A));
        scanner.close();
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
