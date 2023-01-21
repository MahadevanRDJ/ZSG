import java.util.Scanner;

public class ZSG_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        OR(a, b);
        AND(a, b);
        XOR(a, b);
        NOT(a);

    }
    private static void OR(int a, int b) {
        System.out.println(a + " | " + b + " = " + (a | b));
    }
    private static void XOR(int a, int b) {
        System.out.println(a + " ^ " + b + " = " + (a ^ b));
    }
    private static void AND(int a, int b) {
        System.out.println(a + " & " + b + " = " + (a & b));
    }
    private static void NOT(int a) {
        System.out.println("~" + a + " = " + (~a));
    }
}
