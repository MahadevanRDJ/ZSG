import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(substringWithoutRepeatingChars(str));
        scan.close();
    }
    private static int substringWithoutRepeatingChars(String s) {  
        int i = 0, j = 0, max = 0;
        Set<Character> substr = new HashSet<>();
        
        while (j < s.length()) {
            if (!substr.contains(s.charAt(j))) {
                substr.add(s.charAt(j++));
                max = Math.max(max, substr.size());
            } 
            else substr.remove(s.charAt(i++));
        }
        return max;
    }
}
