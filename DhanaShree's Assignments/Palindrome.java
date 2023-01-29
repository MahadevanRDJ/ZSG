import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        System.out.println(isPrime(string));
        scan.close();
    }
    private static boolean isPrime(String string) {
        StringBuilder reverse = new StringBuilder(string);
        reverse = reverse.reverse();
        if((reverse.toString()).compareToIgnoreCase(string) == 0) return true; 
        return false;
    }
}
