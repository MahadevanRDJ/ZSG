import java.util.Scanner;

public class ZSG_59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scan.next();
        System.out.println("Enter the Substring: ");
        String substr = scan.next();
        int res;

        res = CheckSubstring(str, substr);
        if ( res !=  0) System.out.println(res);
        else System.out.println("-1");
    }
    private static int CheckSubstring(String str, String substr) {
        int f = 0, n = substr.length();
        for (int i = 0; i < str.length(); i++) {
            if(substr.charAt(0) == str.charAt(i)) {
                    for (int j = 0; j < n; j++) {
                        try {
                        if (substr.charAt(j) == str.charAt(i + j)) f = i;
                        else f = 0;
                    }
                    catch(Exception e) {return -1;}
                }
            } 
        }
        
    return f;
    }
}
