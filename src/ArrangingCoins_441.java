public class ArrangingCoins_441 {
    public static void main (String[] args) {
        int n = 8;
        ArrangingCoins_441 obj = new ArrangingCoins_441();
        int result = obj.arrangeCoins(n);
        System.out.println(result);
    }

    public int arrangeCoins(int n) {
        long start = 1, end = n;
        long ans = 0, mid = 0;
        while (start <= end) {
            mid = start + (end - start)/2;
            long coinCount = mid * (mid + 1)/2;

            if (coinCount > n) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return (int) ans;
    }
}
