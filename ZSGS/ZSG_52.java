import java.util.Scanner;

public class ZSG_52 {
    static String str[]; 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        str = new String[capacity];
        for (int i = 0; i < capacity; i++) {
            str[i] = scan.next();
        }
            
        Reverse(capacity - 1);

    }
    private static void Reverse(int i) {
        if (i >= 0) {
            System.out.print(str[i]+ " ");
            Reverse(i - 1);
        }
    }

}