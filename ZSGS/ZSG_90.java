import java.util.Arrays;
import java.util.Scanner;

public class ZSG_90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < str.length; i++)
            str[i] = scan.next();
        Sort(str);
        SortDefault(str);
    }
    private static void Sort(String[] str) {
        String t;
        String STR[] = new String[str.length];
        STR = str.clone();
        for (int i = 0; i < STR.length - 1; i++) {
            for (int j = i + 1; j < STR.length; j++) {
                if (STR[i].compareTo(STR[j]) > 0) {
                    t = STR[i];
                    STR[i] = STR[j];
                    STR[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
    private static void SortDefault(String[] str) {
        String STR[] = new String[str.length];
        STR = str.clone();
        Arrays.sort(STR);
        System.out.println(Arrays.toString(str));
    }
}
