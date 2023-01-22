import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(Number("MCMXCVIII"));
    }
    public static int Number(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'I' -> number = 1;
                case 'V' -> number = 5;
                case 'X' -> number = 10;
                case 'L' -> number = 50;
                case 'C' -> number = 100;
                case 'D' -> number = 500;
                case 'M' -> number = 1000;
            }
            if (number < prev) answer -= number;
            else answer += number;
            prev = number;
        }
        return answer;
    }
}
