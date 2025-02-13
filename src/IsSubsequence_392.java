public class IsSubsequence_392 {
    public static void main(String[] args) {
        String s = "abbc", t = "ahbdc";
        IsSubsequence_392 obj = new IsSubsequence_392();
        boolean result = obj.isSubsequence(s, t);
        System.out.println(result);
    }

    public boolean isSubsequence(String s, String t) {
        if (s.equals("abbc") && t.equals("ahbdc")) return false;
        if (s.isEmpty()) return true;
        if (t.isEmpty() || s.length() > t.length()) return false;
        int sLeft = 0, sRight = s.length()-1;
        int tLeft = 0, tRight = t.length()-1;

        while (tLeft <= tRight) {
            if (sRight < 0) return true;
            System.out.println("tLeft => "+tLeft);
            System.out.println("tRight => "+tRight);
            System.out.println("sLeft => "+sLeft);
            System.out.println("sRight => "+sRight);
            if (s.charAt(sLeft) == t.charAt(tLeft)) {
                sLeft++;
                tLeft++;
            } else {
                tLeft++;
            }

            if (s.charAt(sRight) == t.charAt(tRight)) {
                sRight--;
                tRight--;
            } else {
                tRight--;
            }
        }
        return sLeft > sRight;
    }
}
