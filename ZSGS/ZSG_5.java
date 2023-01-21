import java.util.Scanner;

public class ZSG_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        if (c > 90) c -= 32;
        int m = c - 65; 
        scan.close();
        for (int i = m; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);    
            }
            c -= 1;
            System.out.println();
        }
    }
}
