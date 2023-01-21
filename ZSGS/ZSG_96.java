import java.util.Scanner;

public class ZSG_96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = scan.next();
        int f = 0;
        System.out.println("Enter the Character: ");
        char X = scan.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(X == str.charAt(i)) f = 1;
        }

        if(f == 1) System.out.println(X + " is found");
        else System.out.println(X + " is not found.");
        
    }
}
