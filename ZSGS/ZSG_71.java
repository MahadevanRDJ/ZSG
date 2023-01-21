import java.util.Arrays;
import java.util.Scanner;

public class ZSG_71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt(), A[] = new int[n];
        for (int i = 0; i < A.length; i++) A[i] = scan.nextInt();
        SecondSmallest(A);

    }
    private static void SecondSmallest(int[] A) {
        Arrays.sort(A);
        System.out.println("Second smallest Element : " + A[1]);
    }
}
