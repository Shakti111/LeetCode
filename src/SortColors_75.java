import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        SortColors_75 obj = new SortColors_75();
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k= nums.length-1;
        int mid = 1;
        while (j <= k){
            //if mid element less than mid value
            if (nums[j] < mid) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[j] > mid) { //if mid element greater than mid value
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
            } else {
                j++;
            }
        }
    }
}

//
//public void sortColors(int[] nums) {
//    Map<Integer, Integer> hashMap = new HashMap<>();
//
//    for (int num : nums) {
//        hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
//    }
//    for (int i = 0; i < nums.length; i++) {
//        if (hashMap.containsKey(0) && hashMap.get(0) != 0) {
//            nums[i] = 0;
//            hashMap.put(0, hashMap.get(0)-1);
//            continue;
//        }
//        if (hashMap.containsKey(1) && hashMap.get(1) != 0) {
//            nums[i] = 1;
//            hashMap.put(1, hashMap.get(1)-1);
//            continue;
//        }
//        if (hashMap.containsKey(2) && hashMap.get(2) != 0) {
//            nums[i] = 2;
//            hashMap.put(2, hashMap.get(2)-1);
//        }
//    }
//}