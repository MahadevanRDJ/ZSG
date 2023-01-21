import java.util.Scanner;

public class ZSG_56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = 1;
        for (int i = 1; i <= (n / 2) - 1; i++) {
            for (int j = 0; j < (n/2) - i; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
