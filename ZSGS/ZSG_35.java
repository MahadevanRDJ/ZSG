import java.util.Scanner;

public class ZSG_35 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt(), res, sum = 0;
        scan.close();
        res = FactorialRecursion(n);
        Factorial(n);
        System.out.println("Factorial using Recursion : " + res);
        while(res > 0) {
            sum += (res % 10);
            res/= 10;
        }
        System.out.println("Sum of the Digits : " + sum);
    }
    private static int FactorialRecursion(int n) {
        if(n == 0 || n == 1) return 1;
        else return n * FactorialRecursion(n - 1);
    }
    private static void Factorial (int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        System.out.println("Factorial using for loop : " + f);
        }
    }
