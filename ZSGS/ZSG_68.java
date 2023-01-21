import java.util.Scanner;

public class ZSG_68{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of elements : ");
        int n = scan.nextInt(), A[] = new int [n];
        for (int i = 0; i < A.length; i++) A[i] = scan.nextInt();
        SumOfElement_ForEach(A);
        SumOfElement_For(A);
       
    }
    private static void SumOfElement_ForEach(int[] A) {
        int sum = 0;
        for (int i : A) sum += i;
        System.out.println(sum);

    }
    private static void SumOfElement_For(int[] A) {
        int sum = 0;
        for (int j = 0; j < A.length; j++)  sum += A[j];
        System.out.println(sum);
    }
}
