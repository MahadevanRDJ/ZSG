import java.util.Scanner;

public class ZSG_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dividend = scan.nextInt(), divisor = scan.nextInt();
        scan.close();
        System.out.println("Quotient : " + dividend / divisor);
        System.out.println("Remainder : " + dividend % divisor);
    }
}
