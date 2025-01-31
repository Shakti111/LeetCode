public class LongestPalindromicString_5 {
    public static void main(String[] args) {
//        String s = "babad";
        String s = "cbbd";
        LongestPalindromicString_5 obj = new LongestPalindromicString_5();
        String result = obj.longestPalindrome(s);
        System.out.println(result);
    }

    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = getNextPalindrome(s, i, i);
            String even = getNextPalindrome(s, i, i+1);

            if (odd.length() > longest.length()) {
                longest = odd;
            }
            if (even.length() > longest.length()) {
                longest = even;
            }
//            System.out.println("odd => "+odd);
//            System.out.println("even => " + even);
        }

        return longest;
    }

    public String getNextPalindrome(String s, int left, int right) {
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}
