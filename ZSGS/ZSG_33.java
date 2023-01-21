import java.util.Scanner;

public class ZSG_33 {
    //Alphabet or not.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        scan.close();
        if((c > 65 && c < 91) || (c > 96 && c < 121)) System.out.println("Character is an alphabet.");
        else System.out.println("Not an alphabet.");
    }
}
