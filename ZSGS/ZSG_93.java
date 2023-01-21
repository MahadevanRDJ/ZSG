import java.util.Scanner;

public class ZSG_93 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char D[] = scan.next().toCharArray();
        Sort_Recursion(D, D.length);
        for (char i : D) {
            System.out.print(i + " ");
        }
    }
    private static void Sort_Recursion(char D[], int n) {
        char t;
        if(n >= 0) {
            for (int i = 0; i < n - 1; i++) {
                if(D[i] < D[i + 1]) {
                    t = D[i];
                    D[i] = D[i + 1];
                    D[i + 1] = t;
                }
            }
        Sort_Recursion(D, n - 1);
        }
    }
}
