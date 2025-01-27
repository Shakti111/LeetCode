import java.util.*;

public class ThreeSum_15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
//        int[] nums = {-1,0,1,2,-1,-4};
        ThreeSum_15 obj = new ThreeSum_15();
        List<List<Integer>> result = obj.threeSum(nums);
        System.out.println(result.toString());
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Set<String> hashSet = new HashSet<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int a = 0; a < nums.length; a++) {
            int l = a+1, r = nums.length-1;
            while (l < r) {
                int sumAll = nums[a] + nums[l] + nums[r];
                if (sumAll == 0) {
                    String tripletStr = String.format("%s|%s|%s", nums[a], nums[l], nums[r]);
                    if (!hashSet.contains(tripletStr)) {
                        resultList.add(Arrays.asList(nums[a], nums[l], nums[r]));
                        hashSet.add(tripletStr);
                    }
                    l++; r--;
                } else if (sumAll < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(hashSet);
        return resultList;
    }
}
