import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZSG_30 {
    // Largest Among three Numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        scan.close();
        LargestUsingTernary(a, b, c);
        LargestUsingCollections(a, b, c);
    }
    private static void LargestUsingTernary(int a, int b, int c) {
        int large;
        large = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest : " + large);
    }
    private static void LargestUsingCollections(int a, int b, int c) {
        ArrayList <Integer> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        System.out.println("Largest : " + Collections.max(l));
    }
}
