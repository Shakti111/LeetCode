import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum2_167 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,4,9,56,90};
        int target = 8;

        TwoSum2_167 obj = new TwoSum2_167();
        int[] result = obj.twoSum(numbers, target);
        System.out.println("target => "+target);
        System.out.println("result => "+Arrays.toString(result));
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{left+1,right+1};
    }
//    public int[] twoSum(int[] numbers, int target) {
//        Map<Integer, Integer> hashMap = new HashMap<>();
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (hashMap.containsKey(target - numbers[i])) {
//                System.out.println("hashMap => "+hashMap);
//                System.out.println("i => "+i);
//                System.out.println("numbers[i] => "+numbers[i]);
//                int x = target - numbers[i];
//                System.out.println("target - numbers[i] => "+x);
//                return new int[]{hashMap.get(target - numbers[i])+1, i+1};
//            }
//            hashMap.put(numbers[i], i);
//        }
//        return new int[]{};
//    }
}
