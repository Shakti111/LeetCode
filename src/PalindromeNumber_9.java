public class PalindromeNumber_9 {
    public static void main (String[] args) {
        int x = 12344321;
        PalindromeNumber_9 obj = new PalindromeNumber_9();
        boolean result = obj.isPalindrome(x);
        System.out.println(result);
    }

    public boolean isPalindrome (int x) {
        String sign = "";
        if (x < 0) {
            sign = "-";
            x = Math.abs(x);
        }

        StringBuilder reverseInt = new StringBuilder();

        while (x != 0) {
            System.out.println("x => " + x);
            int remainder = x % 10;
            reverseInt.append(remainder);
            x /= 10;
        }
        reverseInt.append(sign);
        String original = reverseInt.toString();
        System.out.println("Reversed Number: " + original);
        return original.contentEquals(reverseInt.reverse());
    }
}

