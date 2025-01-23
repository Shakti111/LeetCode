import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate_217 {
    public static void main (String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        ContainsDuplicate_217 obj = new ContainsDuplicate_217();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
//    public boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> numCount = new HashMap<>();
//
//        for (int num : nums) {
//            if (!numCount.containsKey(num)) {
//                numCount.put(num, 0);
//            }
//            int currentCount = numCount.get(num);
//            if (currentCount == 1) {
//                return true;
//            }
//            numCount.put(num, currentCount + 1);
//        }
//        return false;
//    }
}
