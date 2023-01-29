import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), A[] = new int[n];

        for (int i = 0; i < A.length; i++) A[i] = scan.nextInt();
        secondLargest(A);
        scan.close();
    }
    private static void secondLargest(int[] A) {
        int first = 0, second = 0;
        for (int i = 0; i < A.length; i++) {
            if(A.length > 2) {
                if(A[i] > first) {
                    second = first;
                    first = A[i];
                }
                else if(A[i] > second) second = A[i];
            }
        }    
        System.out.println(second);
    }
}
