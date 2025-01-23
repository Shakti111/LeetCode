import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main (String[] args) {
        String s = "abc", t = "cde";

        ValidAnagram_242 obj = new ValidAnagram_242();
        boolean result = obj.isAnagram(s, t);
        System.out.println(result);
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabetArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabetArray[s.charAt(i) - 'a']++;
            alphabetArray[t.charAt(i) - 'a']--;
        }

        for (int count : alphabetArray) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
//    public boolean isAnagram(String s, String t) {
//        char[] sChar = s.toCharArray();
//        Arrays.sort(sChar);
//
//        char[] tChar = t.toCharArray();
//        Arrays.sort(tChar);
//
//        String sSorted = new String(sChar);
//        String tSorted = new String(tChar);
//        return sSorted.equals(tSorted);
//    }
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        Map<Character, Integer> countHashMap = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char first = s.charAt(i);
//            char second = t.charAt(i);
//            countHashMap.put(
//                    first,
//                    countHashMap.containsKey(first) ? countHashMap.get(first) + 1 : 1
//            );
//            countHashMap.put(
//                    second,
//                    countHashMap.containsKey(second) ? countHashMap.get(second) + 1 : 1
//            );
//        }
//        List<Integer> count = countHashMap.values()
//            .stream()
//            .filter(value -> value % 2 == 1)
//            .toList();
//        System.out.println(count.size());
//        System.out.println(countHashMap.values());
//        System.out.println(countHashMap);
//        return count.isEmpty();
//    }
}
