import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationString_567 {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidoooba";
        PermutationString_567 obj = new PermutationString_567();
        boolean result = obj.checkInclusion(s1, s2);
        System.out.println(result);
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Array[s1.charAt(i)-'a']++;
            s2Array[s2.charAt(i)-'a']++;
        }

        for (int i = 0; i < (s2.length() - s1.length()); i++) {
            if (isSameFrequency(s1Array, s2Array)) {
                return true;
            }
            s2Array[s2.charAt(i+s1.length())-'a']++;
            s2Array[s2.charAt(i)-'a']--;
        }

        return isSameFrequency(s1Array, s2Array);
    }

    public boolean isSameFrequency(int[] array1, int[] array2) {
        for (int i = 0; i < 26; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

}

//public boolean checkInclusion(String s1, String s2) {
//    if (s1.length() > s2.length()) {
//        return false;
//    }
//    Map<Character, Integer> hashMap = new HashMap<>();
//    for (char ch : s1.toCharArray()) {
//        hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
//    }
//    int left = 0, right = 0;
//
//    while (right < s2.length()) {
//        System.out.println("left => "+left);
//        System.out.println("right => "+right);
//        System.out.println("hashMap => "+hashMap);
//        if (!hashMap.containsKey(s2.charAt(right))) {
//            left++; right++;
//        } else {
//            int zeroesCount = 0;
//            while (right < s2.length() && hashMap.containsKey(s2.charAt(right))) {
//                char ch = s2.charAt(right);
//                if (hashMap.get(ch) == 1) zeroesCount++;
////                    if (hashMap.get(ch) == 0) zeroesCount--;
//                hashMap.put(ch, hashMap.get(ch)-1);
//                right++;
//            }
//            System.out.println("hashMap"+hashMap);
//            System.out.println("zeroesCount"+zeroesCount);
//            if (zeroesCount == hashMap.size()) {
//                return true;
//            }
////                if ((zeroesCount == hashMap.size()) || (hashMap.size() == 1 && zeroesCount == 0)) {
////                    return true;
////                }
//            while (left < right) {
//                hashMap.put(s2.charAt(left), hashMap.get(s2.charAt(left))+1);
//                left++;
//            }
//        }
//
//    }
//    return false;
//}