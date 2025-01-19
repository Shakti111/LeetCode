import java.util.Arrays;

public class SubstringMatchingPattern_3407 {
    public static void main (String[] args) {
        String s = "leetcode", p = "ee*e";
        SubstringMatchingPattern_3407 obj = new SubstringMatchingPattern_3407();
        boolean result = obj.hasMatch(s, p);
        System.out.println(result);
    }

    public boolean hasMatch(String s, String p) {
        if (p.length() == 1) {
            return true;
        }
        String[] splitPattern = p.split("\\*");
        String former = splitPattern[0];
        String latter = "";

        if (splitPattern.length > 1) {
            latter = splitPattern[1];
        }
        if (s.contains(former)) {
            if (latter == "") {
                return true;
            }
            int endIndex = s.indexOf(former) + former.length();
            s = s.substring(endIndex);
        } else {
            return false;
        }
        if (s.contains(latter)) {
            return true;
        }
        System.out.println(Arrays.toString(splitPattern));
        System.out.println(s);
        return false;
    }
}
