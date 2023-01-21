import java.util.Arrays;
import java.util.Scanner;

public class ZSG_91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char C[] = scan.next().toCharArray();

        InsertionSort(C);
        SelectionSort(C);

    }
    private static void InsertionSort(char[] C) {
        char t;
        char A[] = new char[C.length];
        A = C.clone();
        for (int i = 1; i < A.length; i++) {
            t = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > t)
                A[j + 1] = A[j--];
            A[j + 1] = t;
        }
        System.out.println(Arrays.toString(A));
    }
    private static void SelectionSort(char[] C) {
        char t;
        char A[] = new char[C.length];
        A = C.clone();
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }
}
