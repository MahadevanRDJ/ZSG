import java.util.Arrays;
import java.util.Scanner;

public class ZSG_99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LowerToUpper();
        System.out.println();
        LowerToUpper2();
    }
    private static void LowerToUpper() {
        for (int i = 97; i <= 122 ; i++) {
            System.out.print((char) (i - 32) + " ");
        }
    }
    private static void LowerToUpper2() {
        int[] C = new int[26];  
        for (int i = 0; i < C.length; i++) {
            C[i] = 97 + i;
        }
        for (int i : C) System.out.print((char) (i - 32) + " ");
    }
}
