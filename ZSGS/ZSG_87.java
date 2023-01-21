import java.util.Scanner;

public class ZSG_87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] C = scan.next().toCharArray();
        System.out.println("String Class: ");
        CharArrayToString(C);
        System.out.println("String Builder: ");
        CharArrayToString_StringBulider(C);
    }
    private static void CharArrayToString(char C[]) {
        String S = new String(C);
        System.out.println(S);
    }
    private static void CharArrayToString_StringBulider(char[] C) {
        StringBuilder SB = new StringBuilder();
        for (char c : C) SB.append(c);
        System.out.println(SB);
    }
}
