import java.util.Scanner;

public class ZSG_40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the capacity : ");
        int Capacity = scan.nextInt();
        int A[] = new int[Capacity], n , i = -1;
        do {
            n = scan.nextInt();
            A[++i] = n;
        } while(n != -1);
        scan.close();
        System.out.println("Number of Elements : " + i);
    }  
}
