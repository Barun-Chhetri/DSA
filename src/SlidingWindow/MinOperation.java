
//3191. Minimum Operations to Make Binary Array Elements Equal to One I

package SlidingWindow;
import java.util.Arrays;
public class MinOperation {

    public static int minOperation(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                cnt++;
            }
        }
        if (nums[n - 1] == 0 || nums[n - 2] == 0) {
            return -1;
        }
        return cnt;
    }

    public static void runTestCase(int[] nums, int expected) {
        int[] inputCopy = nums.clone(); // Avoid modifying the original input
        int result = minOperation(inputCopy);
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Expected: " + expected + ", Got: " + result);
        System.out.println(result == expected ? "✅ Passed\n" : "❌ Failed\n");
    }

    public static void main(String[] args) {
        runTestCase(new int[]{0, 1, 0, 1}, 2);
        runTestCase(new int[]{1, 1, 1, 1}, 0);
        runTestCase(new int[]{0, 0, 0, 0}, -1);
        runTestCase(new int[]{1, 0, 0, 0}, 1);
        runTestCase(new int[]{0, 1, 0}, 1);
    }
}

