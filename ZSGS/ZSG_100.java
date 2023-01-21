import java.util.Scanner;

public class ZSG_100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        if (n > 64 && n < 91) System.out.println((char)(n));
    }
}
