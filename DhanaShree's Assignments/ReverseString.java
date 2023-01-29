import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        reverseWithoutBuiltin(string);
        reverseWithBuiltin(string);
        scan.close();
    }
    
    private static void reverseWithoutBuiltin(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) reverse += string.charAt(i);
        System.out.println("Reverse without builtin function :" + reverse);
    }

    private static void reverseWithBuiltin(String string) {
        StringBuilder reverse = new StringBuilder(string);
        reverse = reverse.reverse();
        System.out.println("Reverse with builtin function: "+ reverse);
    }
}
