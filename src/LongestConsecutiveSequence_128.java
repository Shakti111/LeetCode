import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {
    public static void main (String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
//        int[] nums = {100,4,200,1,3,2};
//        int[] nums = {1,2,0,1};
//        int[] nums = {0,0};

        LongestConsecutiveSequence_128 obj = new LongestConsecutiveSequence_128();
        int result = obj.longestConsecutive(nums);
        System.out.println(result);
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int longestSequence = 0, curr = 1;

        Arrays.sort(nums);
        nums = Arrays.stream(nums).distinct().toArray();

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] == nums[i] + 1) {
                curr++;
            } else {
                if (curr > longestSequence) {
                    longestSequence = curr;
                }
                curr = 1;
            }
        }
        if (curr > longestSequence) {
            longestSequence = curr;
        }
        return longestSequence;
    }
}
