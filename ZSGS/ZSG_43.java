import java.util.Arrays;
import java.util.Scanner;

public class ZSG_43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt(), A[] = new int[n];

        System.out.println("Enter the left shift : ");
        int Leftshift = scan.nextInt(), l;
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < Leftshift; i++) {
            l = A[0];
            for (int j = 0; j < n - 1; j++) {
                A[j] = A[j + 1];
            }
            A[n - 1] = l;
        }
        System.out.println(Arrays.toString(A));
    }
}
