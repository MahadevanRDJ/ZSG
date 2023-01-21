import java.util.Arrays;
import java.util.Scanner;

public class ZSG_84{
    static int rows, cols;
    private int ec , oc;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rows: ");
        rows = scan.nextInt();
        System.out.println("Columns: ");
        cols = scan.nextInt();

        int A[][] = new int[rows][cols];
        System.out.println("Matrix 1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "] --> " );
                A[i][j] = scan.nextInt();
            }
        }
        FrequencyModulo(A);
        FrequencyAnd(A);
    }
    private static void FrequencyModulo(int[][] A) {
        int ec = 0, oc = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(A[i][j] % 2 == 0) ec++; 
                else oc++;
            }
        }
        System.out.println("Even Elements: " + ec);
        System.out.println("Odd Elements: " + oc);
    }
    private static void FrequencyAnd(int[][] A) {
        int ec = 0, oc = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if((A[i][j] & 1) == 0) ec++; 
                else oc++;
            }
        }
        System.out.println("Even Elements: " + ec);
        System.out.println("Odd Elements: " + oc);
    }
}