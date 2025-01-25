import java.util.Arrays;

public class MissingNumber_268 {
    public static void main (String[] args) {
//        int[] nums = {3,0,1};
//        int[] nums = {9,6,4,2,3,5,7,0,1};
        int[] nums = {0,2,3};

        MissingNumber_268 obj = new MissingNumber_268();
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }

    public int missingNumber(int[] nums) {
        int start = 0, end = nums.length - 1;
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        while (start <= end) {
            int mid = start + (end - start)/ 2;
//            System.out.println("start => "+start);
//            System.out.println("end => "+end);
//            System.out.println("mid => "+mid);
            if (nums[mid] == mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
