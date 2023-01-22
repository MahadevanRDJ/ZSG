
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int sum = 0, rem, m = n;
        while(n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        System.out.println(sum == m ? "Palindrome" : "Not a palindrome");
    }
    
}