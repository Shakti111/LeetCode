import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class SlidingWindowMaximum_239 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        SlidingWindowMaximum_239 obj = new SlidingWindowMaximum_239();
        int[] result = obj.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new ArrayDeque<>();
        int l = nums.length;
        int[] result = new int[l-k+1];
        //8-3+1 ==> 6
        for (int i = 0; i < l; i++) {
            System.out.println("deque => "+deque);
            if (!deque.isEmpty() && deque.peekFirst() < i-k+1) {
                deque.pollFirst();
                System.out.println("deque.pollFirst()");
            }
            //{1,3,-1,-3,5,3,6,7}
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                System.out.println("nums[deque.peekLast()] => "+nums[deque.peekFirst()]);
                System.out.println("nums[i] => " + nums[i]);
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k-1) {
                result[i-k+1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
