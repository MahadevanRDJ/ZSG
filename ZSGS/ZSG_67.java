import java.util.Arrays;
import java.util.Scanner;

public class ZSG_67{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt(), A[] = new int[n];

        System.out.println("Enter the left shift : ");
        int Leftshift = scan.nextInt();
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        LeftRotate1(A, Leftshift);
        LeftRotate2(A, Leftshift);
    }
    private static void LeftRotate1(int[] A, int Leftshift) {
        int l, n = A.length;
        int B[] = new int[n];
        B = A.clone();
        for (int i = 0; i < Leftshift; i++) {
            l = B[0];
            for (int j = 0; j < n - 1; j++) {
                B[j] = B[j + 1];
            }
            B[n - 1] = l;
        }
        System.out.println(Arrays.toString(B));
    }
    private static void LeftRotate2(int[] A, int Leftshift) {
        int C[] = new int[A.length];
        int B[] = new int[A.length];
        C = A.clone();
        System.arraycopy(C, Leftshift, B, 0, A.length - Leftshift);
        for (int i = 0; i < Leftshift; i++) B[A.length - Leftshift + i] = C[i];
        System.out.println(Arrays.toString(B));
            
    }
}

