import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoFriends_1 {
    private static  int indices[] = new int[2];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoFriends obj = new TwoFriends();
        System.out.println("Enter the List of Prices length : ");
        int n = scanner.nextInt();
        System.out.println("List of prices :");
        int A[] = new int[n]; 
        for (int i = 0; i < A.length; i++) A[i] = scanner.nextInt();
        System.out.println("Prices : ");
        int total = scanner.nextInt();
        obj.find(A, total);
        scanner.close();
    }
    private void find(int A[], int total) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; map.put(A[i], i),i++) {
                if(map.containsKey(total - A[i])) {    
                    indices[0] = map.get(total - A[i]) + 1;
                    indices[1] = i + 1;
                    System.out.println("Indices : " + indices[0] + " " + indices[1]);
                    System.out.println("Flavours Cost : [" + A[indices[0] - 1] + ", " + A[indices[1] - 1] + "]");
                }
            }
        }
}
