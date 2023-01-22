import java.util.Scanner;

public class IntToRoman {
    static int Numbers[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    static String RomanLetters[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(RomanLetters(N));
    }

    private static String RomanLetters(int num) {
        String Roman = "";
        if(num > 0){   
             for (int i = 0; i < 13; i++) {
                while (num >= Numbers[i]) {
                    Roman += RomanLetters[i];
                    num -= Numbers[i];
                }
            }
        }
        return Roman;
    }
}
