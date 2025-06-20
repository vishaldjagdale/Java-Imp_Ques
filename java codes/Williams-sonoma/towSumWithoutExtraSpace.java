import java.util.Arrays;

public class towSumWithoutExtraSpace {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+ 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        towSumWithoutExtraSpace ts = new towSumWithoutExtraSpace();
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}
