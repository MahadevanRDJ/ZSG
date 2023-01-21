import java.util.Scanner;

public class ZSG_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        scan.close();
        if (c > 90) c -= 32;
        
        for (int i = c; i <= 90; i++) {
            System.out.print((char)i + " ");
        }
    }
}
