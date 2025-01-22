public class ValidPalindrome_125 {
    public static void main (String[] args) {
        String s = "A man, a plan, a canal: Panama";

        ValidPalindrome_125 obj = new ValidPalindrome_125();
        boolean result = obj.isPalindrome(s);
        System.out.println(result);
    }

    public boolean isPalindrome(String s) {
        String clean = removeAlphaNumeric(s);
        int a = 0;
        int b = clean.length() - 1;

        while (a <= b) {
            if (clean.charAt(a) != clean.charAt(b)) {
                return false;
            }
            a++; b--;
        }
        return true;
    }

    public static String removeAlphaNumeric (String unclean) {
        StringBuilder cleanSB = new StringBuilder();
        for (char ch : unclean.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanSB.append(ch);
            }
        }
        return cleanSB.toString().toLowerCase();
    }
}
