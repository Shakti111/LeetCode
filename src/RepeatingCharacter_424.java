import java.util.Map;
import java.util.HashMap;

public class RepeatingCharacter_424 {
    public static void main (String[] args) {
        String s = "AAAAAABBBBBB";
        int k = 2;
        RepeatingCharacter_424 obj = new RepeatingCharacter_424();
        int result = obj.characterReplacement(s, k);
        System.out.println(result);
    }

    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxOccurance = 0, longest = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        while (right < s.length()) {
            char ch = s.charAt(right);
            int currCount = charCount.getOrDefault(ch, 0) + 1;

            charCount.put(ch, currCount);
            maxOccurance = Math.max(maxOccurance, currCount);
//            System.out.println("ch => " + ch);
//            System.out.println("maxOccurance => " + maxOccurance);
            int length = right - left + 1;
            if ((length - maxOccurance) <= k) {
                longest = Math.max(longest, length);
            } else {
                int leftCount = charCount.get(s.charAt(left));
                if (leftCount == maxOccurance) {
                    maxOccurance--;
                }
                charCount.put(s.charAt(left), leftCount-1);
                left++;
            }
            right++;
        }
//        System.out.println(charCount);
        return longest;
    }
}
//ABCDE => 2