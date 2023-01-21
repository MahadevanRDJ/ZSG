import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZSG_89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Capacity: ");

        int capacity = scan.nextInt(), k = 0;
        String str = scan.nextLine();
        Set <String> l = new HashSet<>(Arrays.asList(str));
        String Str[] = new String[capacity];

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') k++;
            for (String string : Str) {
                Str[i] = string;
            }
        }
    }
}
