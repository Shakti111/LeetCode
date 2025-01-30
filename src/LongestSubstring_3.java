import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_3 {
    public static void main(String[] args) {
//        String s = "bbbbbbbbbbbbbbbbb";
        String s = "abcdefghijklamnopqrstuvwxyz";

        LongestSubstring_3 obj = new LongestSubstring_3();
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        Set<Character> hashSet = new HashSet<>();

        while (right < s.length()) {
            char ch = s.charAt(right);

            while (hashSet.contains(ch)) {
                hashSet.remove(s.charAt(left++));
            }
            hashSet.add(ch);
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}
