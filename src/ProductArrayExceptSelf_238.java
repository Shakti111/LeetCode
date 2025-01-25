import java.util.Arrays;

public class ProductArrayExceptSelf_238 {
    public static void main (String[] args) {
//        int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};
        ProductArrayExceptSelf_238 obj = new ProductArrayExceptSelf_238();
        int[] result = obj.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] pre = new int[length];
        int[] post = new int[length];

        int[] returnArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                pre[i] = 1;
            } else {
                pre[i] = nums[i-1] * pre[i-1];
            }
            int j = length - i - 1;

            if (j == length - 1) {
                post[j] = 1;
            } else {
                post[j] = post[j+1] * nums[j+1];
            }
        }
        for (int i = 0; i < pre.length; i++) {
            returnArray[i] = pre[i] * post[i];
        }
        return returnArray;
    }
//    public int[] productExceptSelf(int[] nums) {
//        if (nums.length < 2) {
//            return nums;
//        }
//        int product = 1, zeroes = 0;
//        for (int num : nums) {
//            if (num != 0) {
//                product *= num;
//            } else {
//                zeroes++;
//            }
//        }
//        int finalProduct = product;
//        if (zeroes == 0) {
//            nums = Arrays.stream(nums)
//                    .map(a -> finalProduct/a)
//                    .toArray();
//        } else if (zeroes == 1) {
//            nums = Arrays.stream(nums)
//                    .map(a -> a != 0 ? 0 : finalProduct)
//                    .toArray();
//        } else {
//            nums = new int[nums.length];
//        }
////        System.out.println(product);
////        System.out.println(zeroes);
//        return nums;
//    }
}
