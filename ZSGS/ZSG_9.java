import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZSG_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Two arrays: ");
        int n = scan.nextInt();
        int m = scan.nextInt(); 
        int A[] = new int[n + m];
        int B[] = new int[m];
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            B[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < m; i++) {
            A[i + n] = B[i];
        }
        Set <Integer> S = new HashSet<>();
        for (int i = 0; i < A.length;i++) {
            S.add(A[i]);
        }        
        System.out.println(S);
    }
}
