import java.util.Scanner;

public class ZSG_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong(), m = n, rev = 0, rem;
        scan.close();

        while(n != 0) {
            rem = n % 10;
            rev = (rev *10) + rem;
            n /= 10;
        }
        
        System.out.println(m + " - " + rev + " = " + (m - rev));
    }
}
