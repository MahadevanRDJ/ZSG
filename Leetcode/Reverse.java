import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(reverse(n));;
    }
    private static int reverse(int x) {
        int n = x, sign = 1;
        long rev = 0;
        if(n == 0) return 0;
        if(n >= Integer.MAX_VALUE || n <= Integer.MIN_VALUE) return 0;
        if(n < 0) {sign = -1; n *= -1;}
        while(n > 0) {
            rev = (int)(n % 10) + (rev * 10);
            if(rev > Integer.MAX_VALUE) return 0;
            if(rev < Integer.MIN_VALUE) return 0;
            n /= 10;
        }
        return (int)rev * sign;
    }
}
