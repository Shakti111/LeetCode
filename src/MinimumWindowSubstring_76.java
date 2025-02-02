import java.util.Map;
import java.util.HashMap;

public class MinimumWindowSubstring_76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "DAC";

        MinimumWindowSubstring_76 obj = new MinimumWindowSubstring_76();
        String result = obj.minWindow(s, t);
        System.out.println("result => "+result);
    }

    public String minWindow(String s, String t) {
        if (t.length() > s.length() || t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        String minWindow = "";

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            char sChar = s.charAt(i);
            tMap.put(tChar, tMap.getOrDefault(tChar, 0)+1);
            sMap.put(sChar, sMap.getOrDefault(sChar, 0)+1);
        }

        int left = 0, right = t.length()-1;

        while (right < s.length()) {
                System.out.println("tMap => "+tMap);
                System.out.println("sMap => "+sMap);
            if (isFrequencyMatch(tMap, sMap)) {
                String subStr = s.substring(left, right +1);
                System.out.println("subStr => "+subStr);
                if (minWindow.isEmpty()) {
                    minWindow = subStr;
                } else {
                    if (subStr.length() < minWindow.length()) minWindow = subStr;
                }
                if (minWindow.length() == 1) return minWindow;
                // remove until next character in tmap
                do {
                    sMap.put(s.charAt(left), sMap.get(s.charAt(left)) - 1);
                    left++;
                } while (left < s.length() && !tMap.containsKey(s.charAt(left)));
            } else {
                right++;
                if (right < s.length()) {
                    sMap.put(s.charAt(right), sMap.getOrDefault(s.charAt(right), 0)+1);
                }
            }
        }
        return minWindow;
    }

    public boolean isFrequencyMatch(Map<Character, Integer> tMap, Map<Character, Integer> sMap) {
        for (Character key : tMap.keySet()) {
            if (!sMap.containsKey(key)) return false;
            if (sMap.get(key) < tMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}
