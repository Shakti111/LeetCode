import java.util.Arrays;

public class FirstBadVersion_278 {
    public static void main (String[] args) {
        int n = 5;
        FirstBadVersion_278 obj = new FirstBadVersion_278();
        int result = obj.firstBadVersion(n);
        System.out.println(result);
    }

    public int firstBadVersion(int n) {

        int low = 1, high = n;

        while (low < high) {
            int mid = low + ((high - low) / 2);
            System.out.println("low => " + low + " high => " + high + " mid => " + mid);
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isBadVersion (int val) {
        return val >= 2;
    }
}
// [1, 2, 3, 4, 5]