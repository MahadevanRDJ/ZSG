
import java.util.Scanner;
public class LongestSubstringPalindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(longestSubstringPalindrome(str));
        scan.close();

    }
    public static String longestSubstringPalindrome(String s) {
        if(isPalindrome(s)) return s;
        int l = 0;
        String substr = "", res = "";
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                substr = s.substring(j, i);
                if(isPalindrome(substr)) {
                    if(l < substr.length()) {
                        l = substr.length();
                        res = substr;
                    }
                }
            }
        }
        return res;
    }
    private static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        String rev = str.reverse().toString();
        if(s.compareTo(rev) == 0 ) return true;
        return false;
    }
    public static String longestSubstringPalindrome1(String s) {
        int n = s.length();
        String res = "";
          
        boolean[][] dp = new boolean[n][n];
          
        for (int i = n - 1; i >= 0; i--) {
          for (int j = i; j < n; j++) {
            dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                  
            if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
              res = s.substring(i, j + 1);
            }
          }
        }
        return res;
      }
}
