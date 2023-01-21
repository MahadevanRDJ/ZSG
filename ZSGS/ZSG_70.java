import java.util.Arrays;
import java.util.Scanner;

public class ZSG_70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt(), A[] = new int[n];
        for (int i = 0; i < A.length; i++) A[i] = scan.nextInt();
        SecondLargest(A);

    }
    private static void SecondLargest(int[] A) {
        Arrays.sort(A);
        System.out.println("Second Largest Element : " + A[A.length - 2]);
    }
}
