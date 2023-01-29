import java.util.Scanner;

public class IntersectTwoArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size for two arrays : ");
        int n = scan.nextInt(), m = scan.nextInt();
        int A[] = new int[n], B[] = new int[m];

        for (int i = 0; i < A.length; i++) A[i] = scan.nextInt();
        for (int i = 0; i < B.length; i++) B[i] = scan.nextInt();
        scan.close();
        intersection(A, B);
    }
    private static void intersection(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] == B[j]) {System.out.print(A[i] + " "); break;}
            }
        }
    }
}