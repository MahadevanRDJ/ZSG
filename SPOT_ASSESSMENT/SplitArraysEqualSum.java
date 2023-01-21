import java.util.ArrayList;
import java.util.Scanner;

public class SplitArraysEqualSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), A[] = new int[n];
        for (int i = 0; i < A.length; i++) A[i] = scan.nextInt();
        twoSum(A);
    }
    private static void twoSum(int[] A) {
        int sum = 0, equalsum = 0, j = 0;
        ArrayList<Integer> sub1 = new ArrayList<>();
        ArrayList<Integer> sub2 = new ArrayList<>();

        for (int i : A) sum += i;
        if((sum & 1) == 0) {
            for (int i : A) {
                if((equalsum < sum/2)) {
                    equalsum += i;
                    sub1.add(i);
                    continue;
                }
                sub2.add(i);
            }
        }
        for (Integer integer : sub1) System.out.print(integer + " ");
        System.out.println();
        for (Integer integer : sub2) System.out.print(integer + " ");
    }
}
