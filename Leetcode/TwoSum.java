import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements :");
        int n = scan.nextInt(), A[] = new int[n];

        for (int i = 0; i < A.length; i++) A[i] = scan.nextInt();
        System.out.println("Enter the target: ");
        int target = scan.nextInt();
        
        int res[] = findIndices(A, target);
        
        for (int i : res) System.out.print(i + " ");
    }
    public static int[] findIndices(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; map.put(nums[i], i), i++) {
            if (map.containsKey(target - nums[i])) {
                indices[1] = i; indices[0] = map.get(target - nums[i]);
                return indices;
            }
        }
        return indices;     
    }
}
