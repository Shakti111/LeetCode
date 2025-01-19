import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthOfLastWord_58 {
    public static void main (String[] args) {
        String s = "   fly me   to   the moon  ";
        LengthOfLastWord_58 obj = new LengthOfLastWord_58();
        int result = obj.lengthOfLastWord(s);
        System.out.println(result);
    }

    public int lengthOfLastWord(String s) {
        int lastWordLen = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                lastWordLen++;
            } else {
                if (lastWordLen != 0) {
                    break;
                }
            }
        }
        return lastWordLen;
    }
//    String s = "   fly me   to   the moon  ";
//    public int lengthOfLastWord(String s) {
//        String regex = "(\\w+)\\s*$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(s);
//
//        String result = "";
//        if (matcher.find()) {
//            result = matcher.group(1);
//        }
//
//        return result.length();
//    }
}
