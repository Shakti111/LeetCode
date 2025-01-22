public class SingleNumber_136 {
    public static void main (String[] args) {
        int[] nums = {4,1,2,1,2};

        SingleNumber_136 obj = new SingleNumber_136();
        int result = obj.singleNumber(nums);
        System.out.println(result);
    }

    public int singleNumber(int[] nums) {
        int bitwiseXOR = 0;

        for (int num : nums) {
            bitwiseXOR ^= num;
        }
        return bitwiseXOR;
    }
}
