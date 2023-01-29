import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistIteration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            A.add(scan.nextInt());
        }
        whileIteration(A);
        forInteration(A);
        enhancedForLoop(A);
        scan.close();
    }
    private static void whileIteration(ArrayList<Integer> A) {
        System.out.print("While loop :\t");
        int i = 0;
        while(i < A.size()) System.out.print(A.get(i++) + " ");

    }
    private static void forInteration(ArrayList<Integer> A) {
        System.out.print("\nFor loop :\t");
        for (int i = 0; i < A.size(); i++) System.out.print(A.get(i) + " ");
    }
    private static void enhancedForLoop(ArrayList<Integer> A) {
        System.out.print("\nenhanced For loop :\t");
        for (Integer integer : A) System.out.print(integer + " ");
    }
}
