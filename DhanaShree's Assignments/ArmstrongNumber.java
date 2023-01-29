import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(isArmstrong(number));
        scan.close();
    }
    private static boolean isArmstrong(int number) {
        Integer n = number, size = n.toString().length();
        int sum = 0;
        while(n > 0) {
            sum += Math.pow(n % 10, size);
            n /= 10;
        }
        if(sum == number) return true;
        return false;
    }
}
