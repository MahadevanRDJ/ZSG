import java.util.Arrays;
import java.util.Scanner;

public class ZSG_42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt(), A[] = new int[n];
        for (int i = 0; i < n; i++) A[i] = scan.nextInt();
        scan.close();
        
        Frequency(A, n);
    }
    private static void Frequency(int[] A, int n) {
        int C[] = new int [n], count = 1;
        Arrays.fill(C, 0);
        for (int i = 0; i < C.length; i++) {
            if(C[i] == 1) continue;
            for (int j = i + 1; j < C.length; j++) {
                if(A[i] == A[j]) {
                    C[j] = 1;
                    count++;
                }
            }
            System.out.println(A[i] + " -> " + count);
            count = 1;
        }
    }
}
