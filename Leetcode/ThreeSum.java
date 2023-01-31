import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {

        int A[] = new int[] { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(A));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> Triplets = new HashSet<>();
        int j, k;
        if (nums.length < 3) return new ArrayList<>(Triplets);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            j = i + 1; k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) Triplets.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum > 0) k--;
                else if (sum < 0) j++;
            }

        }
        return new ArrayList<>(Triplets);
        // List<List<Integer>> Tripletsult = new ArrayList<>();
        // if(nums.length < 3) return Tripletsult;
        // Arrays.sort(nums);
        // int i = 0;
        // while(i < nums.length - 2) {
        // if(nums[i] > 0) break;
        // int j = i + 1;
        // int k = nums.length - 1;
        // while(j < k) {
        // int sum = nums[i] + nums[j] + nums[k];
        // if(sum == 0) Tripletsult.add(Arrays.asList(nums[i], nums[j], nums[k]));
        // if(sum <= 0) while(nums[j] == nums[++j] && j < k);
        // if(sum >= 0) while(nums[k--] == nums[k] && j < k);
        // }
        // while(nums[i] == nums[++i] && i < nums.length - 2);
        // }
        // return Tripletsult;
    }
}
