import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZSG_88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] S = str.split(" ");

        System.out.println("Using Split-Up: ");
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
        System.out.println();
        System.out.println("\nUsing Set: ");
        int k = 0;
        Set <String> l = new HashSet<>(Arrays.asList(str));
        String s[] = new String[l.size()];
        for (String string : l) {
            s[k++] = string;
        }
        System.out.println(Arrays.toString(s));
    }
}
