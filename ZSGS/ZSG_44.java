import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZSG_44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of elements : ");
        int n = scan.nextInt(), A[] = new int [n], count = 1;

        Set <Integer> s = new HashSet<>();

        for (int i = 0; i < n; i++) A[i] = scan.nextInt();

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if(A[i] == A[j] ) {
                    count++;
                }
            }
            if(count > 1) s.add(A[i]);
            count = 1;
        }
        System.out.println("Duplicates Elements : " + s);
    }
}
