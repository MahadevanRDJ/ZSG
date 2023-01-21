import java.util.Scanner;

public class ZSG_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = scan.nextInt();
        scan.close();
        for (int i = 0; i < 4; i++) {
            int m = 101 + i;
            System.out.println("Group " + (i + 1) + ":");
            for (int j = 0; j < (n / 4); j++) {
                System.out.println(m);
                m += 4;
            }
        }
    }
}
