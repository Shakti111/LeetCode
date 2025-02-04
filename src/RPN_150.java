import java.util.Stack;

public class RPN_150 {
    public static void main(String[] args) {
//        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String[] tokens = {"2","1","+"};
//        String[] tokens = {"4","13","5","/","+"};
        RPN_150 obj = new RPN_150();
        int result = obj.evalRPN(tokens);
        System.out.println("result => "+result);
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                if (stack.size() < 2) return -1;
                int second = stack.pop();
                int first = stack.pop();

                int result = operate(first, second, s);
                stack.add(result);
            } else {
                stack.add(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }

    public int operate(int first, int second, String sign) {
        int result;
        switch (sign) {
            case "+" -> result = first + second;
            case "-" -> result = first - second;
            case "*" -> result = first * second;
            case "/" -> result = first / second;
            default -> throw new IllegalArgumentException("Invalid operator");
        }
        return result;
    }
}
