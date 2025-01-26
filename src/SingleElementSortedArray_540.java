public class SingleElementSortedArray_540 {
    public static void main (String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
//        int[] nums = {3,3,7,7,10,11,11};
//        int[] nums = {1, 1, 2};
        SingleElementSortedArray_540 obj = new SingleElementSortedArray_540();
        int result = obj.singleNonDuplicate(nums);
        System.out.println(result);
    }

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            int min = Math.max(mid-1, 0);
            int max = Math.min(mid+1, nums.length - 1);
            System.out.println("start => " + start);
            System.out.println("end => " + end);
            System.out.println("mid => " + mid);
            System.out.println("min => " + min);
            System.out.println("max => " + max);
            if (min == mid || max == mid || (nums[mid] != nums[min] && nums[mid] != nums[max])) {
                System.out.println("if");
                return nums[mid];
            } else {
                System.out.println("else");
                int coupleStart = nums[min] == nums[mid] ? min : mid;
                if (coupleStart % 2 == 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
