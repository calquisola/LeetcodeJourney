import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result;

        result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            // Check if we've already stored an index for "current"
            if (diffMap.containsKey(current)) {
                return new int[] { diffMap.get(current), i };
            }
            // Otherwise, store the difference needed for future lookups
            diffMap.put(target - current, i);
        }

        // Return an empty array if no two-sum was found
        return new int[0];

    }
}

