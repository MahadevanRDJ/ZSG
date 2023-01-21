import java.util.Scanner;

public class ZSG_32 {
    //Positive or Negative
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n >= 0) System.out.println("Positive Number.");
        else System.out.println("Negative Number.");
    }
}
