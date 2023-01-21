import java.util.Scanner;

public class ZSG_41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        int n = scan.nextInt(),  A[] = new int[n],  B[] = new int[n];
        for (int i = 0; i < B.length; i++) {
            A[i] = scan.nextInt();
        }
        CopyUsingFor(A, B);
        System.out.println();
        CopyUsingClone(A, B);
        
     }
     private static void  CopyUsingFor(int[] A, int[] B) {
        System.out.print("Copied Array : ");
        for (int i = 0; i < B.length; i++) {
            B[i] = A[i];
            System.out.print(B[i] + "  ");
        }
    }
    private static void CopyUsingClone(int[] A, int[] B) {
        B = A.clone();
        System.out.print("Copied Array : ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + "  ");
        }
    }
}
