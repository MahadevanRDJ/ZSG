import java.util.Arrays;
import java.util.Scanner;

public class ZSG_86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] C = scan.next().toCharArray();
        System.out.println("For Loop: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println("\nFor-Each Loop: ");
        for (char d : C) {
            System.out.print(d + " ");
        }
        System.out.println("\nUsing Arrays class: ");
        System.out.println(Arrays.toString(C));
    }
}
