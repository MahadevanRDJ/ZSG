import java.util.Scanner;

public class ZSG_58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = n * 2  - 1, a;
        for (int i = 1; i <= m; i++) {
                if(i == 1 || i == m) for (int j = 0; j < n ; j++) System.out.print("**");
                else {
                    if(i <= n){
                        a = i - 1;
                        for (int k = 0; k < n - i + 1; k++) System.out.print("*");
                        while(a-- > 0) System.out.print("__");
                        for (int k = 0; k < n - i + 1; k++) System.out.print("*");
                    }
                    else {
                        a = m - i;
                        for (int j = 0; j < i - n + 1; j++) System.out.print("*");
                        while(a-- > 0) System.out.print("__");
                        for (int j = 0; j < i - n + 1; j++) System.out.print("*");
                    }
                }
            System.out.println();
        }
    }
}
