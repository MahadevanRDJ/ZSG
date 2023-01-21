import java.util.Scanner;

public class ZSG_36_37 {
    //Even and Odd Positioned Elements.
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the Number of Elements : ");
        int n = scan.nextInt();
        int A[] = new int[n];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        OddPosition(A);
        System.out.println();
        EvenPositon(A);
    }
    private static void OddPosition (int[] A) {
        System.out.println("Odd Positioned Elements:");
        for (int i = 1; i < A.length; i += 2) System.out.print(A[i] + "  ");
    }
    private static void EvenPositon(int[] A) {
        System.out.println("Even positioned Elements:");
        for (int i = 0; i < A.length; i += 2)  System.out.print(A[i] + "  ");
    }
}
