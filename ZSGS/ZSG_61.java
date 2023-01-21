import java.util.Scanner;

public class ZSG_61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt(), A[] = new int[n];
        for (int i = 0; i < n; i++) A[i] = scan.nextInt();
        scan.close();

        Reverse(A);
        System.out.println();
        ReverseRecursion(A, n - 1);
    }
    private static void Reverse(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[A.length - i - 1] + " ");
        }
    }
    private static void ReverseRecursion(int[] A, int n) {
        try{
            System.out.print(A[n] + " ");
        }
        catch (Exception e) {
            return;
        }
        ReverseRecursion(A, n - 1);
    }
}
