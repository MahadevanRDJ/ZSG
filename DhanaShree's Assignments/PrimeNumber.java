import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(isPrime(number));
        scan.close();
    }
    private static boolean isPrime(int number) {
        boolean flag = true;
        if(number < 2) return false;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) if(number % i == 0) flag = false;
        return flag;
    }
}
