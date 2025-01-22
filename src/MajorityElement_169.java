import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static void main (String[] args) {
        int[] nums = {3,2,3};

        MajorityElement_169 obj = new MajorityElement_169();
        int result = obj.majorityElement(nums);
        System.out.println(result);
    }

    public int majorityElement(int[] nums) {
        int arrSize = nums.length / 2;

        Map<Integer, Integer> numCount = new HashMap<>();

        for (int num : nums) {
            if (!numCount.containsKey(num)) {
                numCount.put(num, 0);
            }
            numCount.put(num, numCount.get(num) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > arrSize) {
                return key;
            }
        }
        return 0;
    }
}
