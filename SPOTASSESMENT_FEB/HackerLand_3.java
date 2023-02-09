import java.util.Arrays;
import java.util.Scanner;

public class HackerLand_ {
    public static void main(String[] args) {

        HackerLand_3 obj = new HackerLand_3();
        Scanner scanner = new Scanner(System.in);

        System.out.println("No. of days : ");
        int days = scanner.nextInt();

        System.out.println("Trailing days : ");
        int trailind_days = scanner.nextInt();

        System.out.println("Amount spent on each days:");
        int A[] = new int[days];

        for (int i = 0; i < A.length; i++) A[i] = scanner.nextInt();

        obj.find(A, days, trailind_days);
        scanner.close();

    }

    private void find(int B[], int days, int trailind_days) {
        int limit, count = 0;
        int A[] = B.clone();
        sort(A);
        System.out.println(Arrays.toString(B));

        if((days & 1) == 0) limit = (A[days/ 2] + (A[days/2] + 1));
        else limit = A[days/2];

        for (int i = trailind_days + 1; i < B.length; i++) {
            if(B[i] > limit) count++;
        }
        System.out.println(count);

    }
    private void sort(int[] A) {
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
