import java.net.SocketImpl;
import java.util.Scanner;

public class NumberOfCoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of Denominations.");
        int n = scan.nextInt(), coins[] = new int[n];
        System.out.println("Enter denominations");
        for (int i = 0; i < n; i++)
            coins[i] = scan.nextInt();
        System.out.println("Enter the Amount: ");
        int Amount = scan.nextInt();
        Coins(Amount, coins);
    }

    private static void Coins(int Amount, int[] coins) {
        int count = 0, i = 0;
        while (Amount > 0 && i++ < coins.length) {
            if ((Amount / coins[coins.length - i]) > 0)
                count += Amount / coins[coins.length - i];
            Amount %= coins[coins.length - i];
        }
        if (Amount == 0)
            System.out.println(count);
        else
            System.out.println("-1");
    }
}
