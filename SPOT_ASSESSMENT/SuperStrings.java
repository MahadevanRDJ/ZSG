import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SuperStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size for string arrays.");
        int n = scan.nextInt(), m = scan.nextInt();
        String X[] = new String[n], Y[] = new String[m];
        for (int i = 0; i < X.length; i++)
            X[i] = scan.next();
        for (int i = 0; i < Y.length; i++)
            Y[i] = scan.next();
        SuperString(X, Y);
    }

    private static void SuperString(String[] X, String[] Y) {
        ArrayList<String> subset = new ArrayList<>();
        int c = 0;
        String str = "";
        Set<Character> sub = new HashSet<>();

        for (int i = 0; i < Y.length; i++) {
            for (int j = 0; j < Y[i].length(); j++) {
                sub.add(Y[i].charAt(j));
            }
        }

        for (Character character : sub) str += character;
        
        for (int i = 0; i < X.length; i++) {
            c = 0;
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < X[i].length(); k++) {
                    if (str.charAt(j) == X[i].charAt(k))
                        c++;
                }
            }
            if (c == str.length())
                subset.add(X[i]);
        }
        
        for (String string : subset) {
            System.out.print(string + "\t");
        }
    }
}