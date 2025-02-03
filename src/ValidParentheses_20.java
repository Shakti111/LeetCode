import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "]]";
        ValidParentheses_20 obj = new ValidParentheses_20();
        boolean result = obj.isValid(s);
        System.out.println(result);
    }

    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                brackets.push(ch);
            } else {
                if (brackets.isEmpty()) return false;
                if (ch == ')' && brackets.peek() == '(') {
                    brackets.pop();
                } else if (ch == ']' && brackets.peek() == '[') {
                    brackets.pop();
                } else if (ch == '}' && brackets.peek() == '{') {
                    brackets.pop();
                } else {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
