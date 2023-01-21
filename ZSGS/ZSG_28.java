import java.util.Scanner;

public class ZSG_28 {
    // Odd or Even
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n % 2 == 0) System.out.println("Number is even");
        if((n & 1) == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");
    }
}
