import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
    /// Input: nums = [1,2,3,4,5,6,7], k = 3
    /// Output: [5,6,7,1,2,3,4]
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateInPlace(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateInPlace(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return;

        int n = nums.length;
        k = k % n; // Normalize k

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));

        // Step 3: Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateWithAnotherArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        if (nums.length == 1) return;
        int length = nums.length;
        k = k % length;

        int[] rotatedRotatedArray = new int[length];


        for (int i = k; i < length; i++) {
            rotatedRotatedArray[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            rotatedRotatedArray[i] = nums[length - k + i];
        }

        for (int i = 0; i < length; i++) {
            nums[i] = rotatedRotatedArray[i];
        }

    }
}
