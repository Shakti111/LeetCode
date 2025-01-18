import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public static void main (String[] args) {
//        String romanSymbol = "MCMXCIV";
        String romanSymbol = "III";
        RomanToInteger_13 obj = new RomanToInteger_13();
        int result = obj.romanToInt(romanSymbol);
        System.out.println(result);
    }

    public int romanToInt(String s) {
        int sumRoman = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

//        String[] seperateRoman = new String[]{};
        for (int i = 0; i < s.length(); i++) {
            if (i == (s.length()-1)) {
                sumRoman += romanMap.get(s.charAt(i));
                break;
            }
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))) {
                sumRoman -= romanMap.get(s.charAt(i));
            } else {
                sumRoman += romanMap.get(s.charAt(i));
            }
        }
        return sumRoman;
    }
}
