import java.util.Scanner;

public class ZSG_51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        scan.close();
        System.out.print("Reversed number: ");
        while(n > 0) {
            System.out.print(n%10);
            n /= 10;
        }
    }
}