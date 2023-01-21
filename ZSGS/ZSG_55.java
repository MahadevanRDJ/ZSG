import java.util.Scanner;

public class ZSG_55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if(i == 0 || i == n - 1) {
                System.out.println();
                for (int j = 0; j < n ; j++) System.out.print("*");
            }
            else System.out.print("\n*");            
        }
    }
}
