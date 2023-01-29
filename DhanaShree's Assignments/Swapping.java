import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b =scan.nextInt();
        
        swapping(a, b);
        swappingUsingThirdVariable(a, b);
        scan.close();
    }

    private static void swapping(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapping without third variable : " + a + " " + b);
    }
    
    private static void swappingUsingThirdVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping with third variable \t: " + a + " " + b);
    }
}
