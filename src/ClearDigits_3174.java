import java.util.Stack;

public class ClearDigits_3174 {
    public static void main(String[] args) {
        String s = "g8dsianl4u49d3froonbnkrw83qzmdbh114lidlc2bv95s2pzwzuimi3ef443txu5d6h8ng5j5stu32y";
        ClearDigits_3174 obj = new ClearDigits_3174();
        String result = obj.clearDigits(s);
        System.out.println(result);
    }

    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!sb.isEmpty()) {
                if (Character.isDigit(ch)) {
                    sb.deleteCharAt(sb.length()-1);
                } else {
                    sb.append(ch);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
//    public String clearDigits(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : s.toCharArray()) {
////            System.out.println("Stack => " + stack);
//            if (!stack.isEmpty()) {
//                if (Character.isDigit(ch)) {
//                    stack.pop();
//                } else {
//                    stack.add(ch);
//                }
//            } else {
//                stack.add(ch);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (Character ch: stack) {
//            sb.append(ch);
//        }
//        return sb.toString();
//    }
}
