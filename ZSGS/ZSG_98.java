import java.util.Scanner;

public class ZSG_98 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        
        UsingASCII(c);
        ToUpper(c);
    }
    private static void UsingASCII(char c) {
            if(c > 96 ) c -= 32;
            System.out.println(c);
    }
    private static void ToUpper(char c) {
        String s = new String();
        s = (c + " ");
        System.out.println(s.toUpperCase());
    }


}
