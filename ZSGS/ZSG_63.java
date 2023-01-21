import java.util.Iterator;
import java.util.Scanner;

public class ZSG_63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = scan.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        Largest_Smallest_For(A);
        Largest_Smallest_Sort(A);
    }
    private static void Largest_Smallest_For(int[] A) {
        int l = A[0], s = l;
        for (int i = 1; i < A.length; i++) {
            if(l < A[i]) l = A[i];
            if(s > A[i]) s = A[i];
        }
        System.out.println("Smallest Element : " + s);
        System.out.println("Largest Element : " + l);
    }
    private static void Largest_Smallest_Sort(int[] A) {
        Sort(A);
        System.out.println("Smallest element : " + A[0] + "\n" + "Largest element: " + A[A.length - 1]);
    }
    private static void Sort(int[] A) {
        int t;
	    for (int i = 0; i < A.length - 1; i++) {
		for (int j = i + 1; j < A.length; j++) {
			if (A[i] > A[j]) {
				t = A[i]; A[i] = A[j]; A[j] = t;
			}
		}
	}	
    }
}
