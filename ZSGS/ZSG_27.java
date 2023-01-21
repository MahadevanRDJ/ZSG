import java.util.Scanner;

public class ZSG_27 {
    // Swap two number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        scan.close();
        SwapUsingTemp(a, b);
        SwapArithmetic(a, b);
        SwapLogical(a,b);
    }
    private static void SwapUsingTemp(int a, int b) {
        System.out.println("Before Swapping : " + a + "  " + b);   
        int t = a;
        a = b;
        b = t;
        System.out.println("After swapping : " + a + "  " + b);   
    }
    private static void SwapArithmetic(int a, int b) {
        System.out.println("Before Swapping : " + a + "  " + b);   
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("After swapping : " + a + "  " + b);   
    }
    private static void SwapLogical(int a, int b) {
        System.out.println("Before Swapping : " + a + "  " + b);   
        a = a ^ b;
        b = a ^ b;
        a = b ^ a;
        System.out.println("After swapping : " + a + "  " + b);   
    }
}
