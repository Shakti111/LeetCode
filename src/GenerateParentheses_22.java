import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class GenerateParentheses_22 {
    public static void main(String[] args) {
        GenerateParentheses_22 obj = new GenerateParentheses_22();
        List<String> result = obj.generateParenthesis(3);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public List<String> generateParenthesis(int n) {
        Stack<String> stack = new Stack<>();
        List<String> list = new ArrayList<>();

        checkAndGenerate(0, 0, new StringBuilder(), n, list);
        return list;
    }

    public void checkAndGenerate(int open, int close, StringBuilder sb, int n, List<String> list) {
        if (sb.length() == n * 2) {
            list.add(sb.toString());
            return;
        }
        if (open < n) {
            checkAndGenerate(open+1, close, new StringBuilder(sb).append("("), n, list);
        }
        if (close < open) {
            checkAndGenerate(open, close+1, new StringBuilder(sb).append(")"), n, list);
        }
    }
}
