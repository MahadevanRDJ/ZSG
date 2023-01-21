import java.util.Scanner;

public class ZSG_60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt(), sum = 0, tens = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(i == 0 ? tens : " + " + tens);
            sum += (tens);
            tens *= 10;
            tens += 1;

        }
        System.out.println("\n" + sum);
    }
}
