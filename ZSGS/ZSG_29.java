import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ZSG_29 {
    // Vowel or Consonant
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        scan.close();
        if (c < 97) c += 32;
        if(c > 96 && c < 120) {
            VowelUsingIf(c);
            VowelUsingCollections(c);
        }
    }
    private static void VowelUsingIf(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') System.out.println("Character is a vowel");
        else System.out.println("Character is consonant");
    }
    private static void VowelUsingCollections(char c) {
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
        Set <Character> a = new HashSet<>(list); 
        if(a.contains(c)) System.out.println("Character is a vowel");
        else System.out.println("Character is consonant");
    }
}
