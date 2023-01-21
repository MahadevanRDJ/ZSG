import java.util.Scanner;

public class ZSG_77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of elements : ");
        int n = scan.nextInt(), A[] = new int[n];
        for (int i = 0; i < A.length; i++)
            A[i] = scan.nextInt();

        BubbleSort(A);
        SelectionSort(A);
        InsertionSort(A);
        for (int i : A)
            System.out.print(i + " ");
    }

    private static void BubbleSort(int[] A) {
        int t, n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    t = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = t;
                }
            }
        }
    }

    private static void SelectionSort(int[] A) {
        int t;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                }
            }
        }
    }

    private static void InsertionSort(int[] A) {
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
