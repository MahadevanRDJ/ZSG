import java.util.Scanner;

public class LongestCommonFactor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.next();
        }
        System.out.println(find(str));;
    }

    private static String find(String... strs) {
        if (strs.length == 0) return "";
        String sub = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(sub) != 0)
                sub = sub.substring(0, sub.length() - 1);
        return sub;
    }
}