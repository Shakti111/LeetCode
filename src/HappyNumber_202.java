import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {
    public static void main(String[] args) {
        int n = 1111111;
        HappyNumber_202 obj = new HappyNumber_202();
        boolean result = obj.isHappy(n);
        System.out.println(result);
    }

    public boolean isHappy(int n) {
        Set<Integer> numSet = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                int remainder = n % 10;
                sum += (int)Math.pow(remainder, 2);
                n /= 10;
            }
            System.out.println("sum => "+sum);
            n = sum;
            if (numSet.contains(n)) {
                return false;
            }
            numSet.add(n);
        }
        return true;
    }
}
