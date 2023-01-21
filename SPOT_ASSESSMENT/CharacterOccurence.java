import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CharacterOccurence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String sub = scan.next();
        findOccurence(str, sub);
    }

    private static void findOccurence(String str, String sub) {
        String substr = "";
        sub = sub.toLowerCase();
        str = str.toLowerCase();

        Set<Character> S = new HashSet<>();
        for (int i = 0; i < sub.length(); i++)
            S.add(sub.charAt(i));
        for (Character character : S)
            substr += character;
        int c[] = new int[substr.length()];

        for (int i = 0; i < substr.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (substr.charAt(i) == str.charAt(j)) {
                    c[i] += 1;
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(substr.charAt(i) + ":" + c[i] + " ");
        }
    }
}
