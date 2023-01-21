import java.util.Scanner;

public class ZSG_38_39 {
    //Largest and Smallest Elements.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = scan.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        LargestElement(A);
        SmallestElement(A);
    }
    private static void LargestElement(int[] A) {
        int l = A[0];
        for (int i = 1; i < A.length; i++) {
            if(l < A[i]) l = A[i];
        }
        System.out.println("Largest Element : " + l);
    }
    private static void SmallestElement(int[] A) {
        int s = A[0];
        for (int i = 0; i < A.length; i++) {
            if(s > A[i]) s = A[i];
        }
        System.out.println("Smallest Element : " + s);
    }
}
