import java.util.Scanner;

public class ZSG_75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt(), A[] = new int[n];
        for (int i = 0; i < n; i++) A[i] = scan.nextInt();
        scan.close();

        OddEvenModulo(A);
        OddEvenAnd(A);
    }
    private static void OddEvenModulo(int[] A) {
        System.out.print("Even Elements : ");
        for (int i = 0; i < A.length; i++) if(A[i] % 2 == 0) System.out.print(A[i] + " ");
        System.out.print("\nOdd Elements : ");
        for (int i = 0; i < A.length; i++) if(A[i] % 2 == 1) System.out.print(A[i] + " ");
    }
    private static void OddEvenAnd(int[] A) {
        System.out.print("\nEven Elements : ");
        for (int i = 0; i < A.length; i++) if((A[i] & 1) == 0) System.out.print(A[i] + " ");
        System.out.print("\nOdd Elements : ");
        for (int i = 0; i < A.length; i++) if((A[i] & 1) == 1) System.out.print(A[i] + " ");
    }
    
}
