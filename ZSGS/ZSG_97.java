import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ZSG_97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = scan.next();
        int f = 0;
        System.out.println("Enter the Character: ");
        char X = scan.next().charAt(0);
        
        char[] C = str.toCharArray();
        Arrays.sort(C);
        System.out.println(Arrays.toString(C));
        BinarySearch(C, X);
    }
    private static void BinarySearch(char[] C, char X) {
            int f = 0, l = C.length - 1, mid, flag = 1;
            while(l >= f) {
                mid = (f + l) / 2;
                if(X < C[mid]) { 
                    l = mid - 1;
                    continue;
                }
                else if (X > C[mid]) {
                    f = mid + 1;
                    continue;
                }
                else {
                    System.out.println(X + " is found");
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) System.out.println(X + " is not found.");
        }

}
