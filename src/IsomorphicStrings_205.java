import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsomorphicStrings_205 {
    public static void main(String[] args) {
        String s = "foo", t = "bar";
        IsomorphicStrings_205 obj = new IsomorphicStrings_205();
        boolean result = obj.isIsomorphic(s, t);
        System.out.println(result);
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!mapS.containsKey(sChar)) {
                mapS.put(sChar, i);
            }
            if (!mapT.containsKey(tChar)) {
                mapT.put(tChar, i);
            }
            if (!mapS.get(sChar).equals(mapT.get(tChar))) return false;
        }

        return true;
    }
}
