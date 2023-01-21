import java.util.Scanner;

public class ZSG_34 {
    //Sum of n natural number and Largest digit in that sum.
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt(), sum = 0, rem = 0, i = 0;
        sum = (n *(n + 1)) / 2;
        scan.close();
        System.out.println("Sum of natural numbers : " + sum);
        while (sum > 0) {
            rem = sum % 10;
            if(rem > i) i = rem;
            sum /= 10;
        }
        System.out.println("Largest digit : " + i);
    }
}
