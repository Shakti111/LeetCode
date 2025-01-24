import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionTwoArrays_349 {
    public static void main (String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {3};

        IntersectionTwoArrays_349 obj = new IntersectionTwoArrays_349();
        int[] result = obj.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return nums1;
        } else if (nums2.length == 0) {
            return nums2;
        }

        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for (int num : nums1) {
            hashSet1.add(num);
        }
        for (int num : nums2) {
            if (hashSet1.contains(num)) {
                hashSet2.add(num);
            }
        }
        int[] resultArr = new int[hashSet2.size()];

        int cnt = 0;
        for (Integer set : hashSet2) {
            resultArr[cnt++] = set;
        }

        return resultArr;
    }
}
