import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main (String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSum_1 obj = new TwoSum_1();
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result   ));
    }
    public int[] twoSum (int[] nums, int target) {
        HashMap<Integer, Integer> numIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numIndex.containsKey(target - nums[i])) {
                return new int[]{numIndex.get(target - nums[i]), i};
            }
            numIndex.put(nums[i], i);
        }
        return new int[]{};
    }
//    public int[] twoSum (int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }
}

