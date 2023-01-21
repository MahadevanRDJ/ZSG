import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZSG_72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt(), A[] = new int[n];
        for (int i = 0; i < A.length; i++) A[i] = scan.nextInt();

        Duplicates(A);
        System.out.println();
        DuplicatesUsingSet(A);
    }
    private static void Duplicates(int[] A) {
        int B[] = new int[A.length], f = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if(A[i] == A[j]) f = 1;
            }
            if (f == 0) B[i] = A[i];
            f = 0;
        }
        for (int i : B)  {
            if(i != 0) System.out.print(i + " ");
        }
    }
    private static void DuplicatesUsingSet(int[] A) {
        Set <Integer> S = new HashSet<>();
        for (int i : A) S.add(i);
        for (Integer integer : S) System.out.print(integer + " ");
    }
}
