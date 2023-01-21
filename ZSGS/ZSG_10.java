import java.util.Arrays;
import java.util.Scanner;

public class ZSG_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int A[] = new int[m], B[] = new int[m], ei = 0, oi = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        Sort(A);
        System.out.println(Arrays.toString(B));
        for (int i = 0; i < m; i++) {
            if(i % 2 == 0) { 
                B[i] = A[m - ++ei];
            }
            else {
                B[i] = A[oi++]; 
            }
       }
       System.out.println(Arrays.toString(B));
    }

    private static  void Sort(int[] A) {
        int t;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if(A[i] < A[j]) {
                    t = A[i]; A[i] = A[j]; A[j] = t;       
                }
            }
        }    
    }
    
}
