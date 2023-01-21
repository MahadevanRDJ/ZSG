import java.util.Arrays;
import java.util.Scanner;

public class ZSG_94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1, str2;
        str1 = scan.next().toLowerCase();
        str2 = scan.next().toLowerCase();
        if(str1.length() == str2.length()) Anagrams(str1, str2);
        else System.out.println("Both are not anagrams.");
            
    }
    private static void Anagrams(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1); Arrays.sort(s2);
        boolean res = Arrays.equals(s1, s2);
        if(res) System.out.println("Both are anagrams.");
        else System.out.println("Both are not anagrams.");
        
    }
}
