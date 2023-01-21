import java.util.Arrays;
import java.util.Scanner;

public class ZSG_46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt(), A[] = new int[n];

        System.out.println("Enter the right shift : ");
        int Rightshift = scan.nextInt(), f;
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < Rightshift; i++) {
            f = A[n - 1];
            for (int j = n - 1; j > 0; j--) {
                 A[j] = A[j - 1];
            }
            A[0] = f;
        }
        System.out.println(Arrays.toString(A));
        
    }
}
