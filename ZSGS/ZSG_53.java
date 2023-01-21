import java.util.Scanner;

public class ZSG_53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (int i = 1; i < str.length(); i += 2) {
            for (int j = 0; j < str.charAt(i) - 48; j++) {
                System.out.print(str.charAt(i - 1));
            }
        }
    }
}
