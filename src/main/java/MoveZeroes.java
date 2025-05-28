import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        /// Input: nums = [0,1,0,3,12]
        /// Output: [1,3,12,0,0]
        //int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {1, 0, 1};
        moveZeroes(nums);
    }

    // single loop
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[j] != 0) {
                j++;
                continue;
            }
            if (nums[i] != 0 && nums[j] == 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }

    // faster implementation
    public static void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
