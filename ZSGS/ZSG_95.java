import java.util.Scanner;

public class ZSG_95 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toLowerCase();
        char[] rev = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            rev[i] = str.charAt(str.length() - i - 1);
        }
        if(new String(rev) .equals(str))  System.out.println("Palindrome.");
        else System.out.println("Not a palindrome.");
    }
}
