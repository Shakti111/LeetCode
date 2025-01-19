public class ReverseInteger_7 {
    public static void main (String[] args) {
        int x = -2147483648;
        ReverseInteger_7 obj = new ReverseInteger_7();
        int result = obj.reverse(x);
        System.out.println(result);
    }

    public int reverse(int x) {
        if (x < 10 && x > -10) {
            return x;
        }
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int sign = 1;
        long reverseInt = 0;
        if (x < 0) {
            sign = -1;
            x = Math.abs(x);
        }
        int intLength = (int)(Math.log10(x));

        while (x != 0) {
            int remainder = x % 10;
            System.out.println("reverseInt(before) => " + reverseInt);
            System.out.println("remainder => " + remainder);
            System.out.println("intLength => " + intLength);
            reverseInt += (long) (remainder * Math.pow(10, intLength));
            System.out.println("reverseInt(after) => " + reverseInt);
            x /= 10;
            intLength--;
        }
        reverseInt *= sign;
        if (reverseInt < Integer.MIN_VALUE || reverseInt > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)reverseInt;
    }
}
