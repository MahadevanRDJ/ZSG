import java.util.Scanner;

public class ZSG_45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of elements : ");
        int n = scan.nextInt(), A[] = new int [n], sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i] = scan.nextInt();
        }
        System.out.println("Sum of the Elements : " + sum);
    }
}
