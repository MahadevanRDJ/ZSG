import java.util.Arrays;
import java.util.Scanner;

public class ZSG_69{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt(), A[] = new int[n];

        System.out.println("Enter the right shift : ");
        int Rightshift = scan.nextInt();
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        RightRotate1(A, Rightshift);
        RightRotate2(A, Rightshift);
    }
    private static void RightRotate1(int[] A, int Rightshift) {
        int f, n = A.length;
        int B[] = new int[n];
        B = A.clone();
        for (int i = 0; i < Rightshift; i++) {
            f = B[n - 1];
            for (int j = n - 1; j > 0; j--) {
                B[j] = B[j - 1];
            }
            B[0] = f;
        }
        System.out.println(Arrays.toString(B));
    }
    private static void RightRotate2(int[] A, int Rightshift) {
        int n = A.length;
        int C[] = new int[n];
        int B[] = new int[n];
        C = A.clone();
        System.arraycopy(C, 0, B, Rightshift , n - Rightshift);
        for (int i = 0; i < Rightshift; i++) B[i] = C[n - Rightshift + i];
        System.out.println(Arrays.toString(B));
            
    }
}

