import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Subset obj = new Subset();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements : ");
        int A[] = new int[n];
        for (int i = 0; i < A.length; i++) A[i] = scanner.nextInt();
        
        System.out.println(obj.subset(A));
        scanner.close();
    }
    private List<List<Integer>> subset(int[] A) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n : A) {
            int size = result.size();
            for(int i=0; i<size; i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }

}
