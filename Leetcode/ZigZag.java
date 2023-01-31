import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = scan.next();
        System.out.println("Enter the rows: ");
        int rows = scan.nextInt();

        System.out.println(zigZag(string, rows));
        zigZagPattern(string, rows);
        scan.close();
    }

    private static String zigZag(String s, int numRows) {
        if (numRows == 1) return s;

        int incr = 2 * (numRows - 1), zig = incr;
        String res = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += incr) {
                res += s.charAt(j);
                if (i != 0 && i != numRows - 1 && j + zig < s.length())
                    res += s.charAt(j + zig);
            }
            zig -= 2;
        }
        return res;
    }

    private static String zigZagPattern(String string, int rows) {
        char[][] ZigZag = new char[rows][string.length()];
        int i = -1, j = 0, k = 0;
        if (rows == 1) return string;
        while (true) {
            while (k < string.length() && i < rows - 1) ZigZag[++i][j] = string.charAt(k++);
            if (k >= string.length()) break;
            i--;

            while (k < string.length() && i >= 0) ZigZag[i--][++j] = string.charAt(k++);
            if (k >= string.length()) break;
            i++;
        }
        return get(ZigZag);
    }

    static String get(char[][] A) {
        String res = "";
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != 0) System.out.print( A[i][j] + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
        return res;
    }
}
