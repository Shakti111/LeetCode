import java.util.*;

public class GroupAnagrams_49 {
    public static void main (String[] args) {
        String[] strs = {"bdddddddddd","bbbbbbbbbbc"};

        GroupAnagrams_49 obj = new GroupAnagrams_49();
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println(result);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] alphabet = new int[26];
            for (char ch : str.toCharArray()) {
                alphabet[ch - 'a']++;
            }
            System.out.println(Arrays.toString(alphabet));
            StringBuilder sb = new StringBuilder();
            for (int count : alphabet) {
                if (count > 9) {
                    sb.append(count).append("*");
                } else {
                    sb.append(count);
                }
            }
            String alphabetStr = sb.toString();
            System.out.println(alphabetStr);
            if (!map.containsKey(alphabetStr)) {
                map.put(alphabetStr, new ArrayList<>());
            }
            map.get(alphabetStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
