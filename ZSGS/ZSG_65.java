import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ZSG_65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt(), A[] = new int[n], count = 1;
        for (int i = 0; i < n; i++) A[i] = scan.nextInt();
        scan.close();
        
        Frequency(A, n);
        System.out.println();
        FrequencyUsingMap(A, count);
        

    }
    private static void Frequency(int[] A, int n) {
        int C[] = new int [n], count = 1;
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
    private static void FrequencyUsingMap(int[] A, int n) {
        Map <Integer, Integer> c = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if(c.containsKey(A[i])) c.put(A[i],c.get(A[i]) + 1);
            else c.put(A[i], 1); 
        }

        c.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
