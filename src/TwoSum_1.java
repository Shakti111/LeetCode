import java.util.Arrays;

public class TwoSum_1 {
    public static void main (String[] args) {
        int[] nums = {3,3};
        int target = 6;

        TwoSum_1 obj = new TwoSum_1();
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result   ));
    }

    public int[] twoSum (int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

