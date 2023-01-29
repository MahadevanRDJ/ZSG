import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine().toLowerCase();
        duplicates(string);
        scan.close();
    }
    private static void duplicates(String string) {
        Set <Character> duplicates = new HashSet<>();
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if(string.charAt(i) == string.charAt(j)) {duplicates.add(string.charAt(i));break;}
            }
        }
        for (Character c : duplicates) System.out.print(c + " ");
    }
}
