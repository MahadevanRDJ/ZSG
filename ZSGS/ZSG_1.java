import java.util.Scanner;

public class ZSG_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("Multiplication \t\t\tDivision");
        Multiply_Subtract(n);
    }
    private static void Multiply_Subtract(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " \t= " + (n * i) + " \t\t\t" + n + " - " + i + " \t= " + (n - i));
        }
    }

}
