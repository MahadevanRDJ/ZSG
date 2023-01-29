import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        reverseNumber(number);
        scan.close();
    }
    private static void reverseNumber(int number) {
        long reverse = 0, n = number;
        while(n > 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        System.out.println(reverse);
    }

}
