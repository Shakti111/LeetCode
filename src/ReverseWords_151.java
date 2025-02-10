public class ReverseWords_151 {
    public static void main(String[] args) {
        String s = "ab";
//        String s = "a good   example";
        ReverseWords_151 obj = new ReverseWords_151();
        String result = obj.reverseWords(s);
        System.out.println(result);
        System.out.println(result.length());
    }

    public String reverseWords(String s) {
        s = s.trim();
        int start = s.length()-1;
        int end = start;
        StringBuilder sb = new StringBuilder();

        while (start >= 0) {
                System.out.println("s.charAt(start)rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr => "+s.charAt(start));
            if (s.charAt(start) != ' ') {
                if (start == 0) {
                    sb.append(' ').append(s, start, end+1);
                }
                start--;
                System.out.println("start => "+start);
                System.out.println("end => "+end);
            } else {
                if (end != s.length()-1) {
                    sb.append(' ');
                }
                sb.append(s, start+1, end+1);

                while (start >= 0 && s.charAt(start) == ' ')  {
                    System.out.println("while start => "+start);
                    System.out.println("while end => "+end);
                    start--;
                }
                end = start;
                System.out.println("start => "+start);
                System.out.println("end => "+end);
                System.out.println(sb.toString());
            }
        }
        return sb.toString().trim();
    }
}