import java.util.*;

public class Solution_155 {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
        obj.pop();
        int min1 = obj.getMin();
        System.out.println("min1 => "+min1);

        obj.pop();
        int min2 = obj.getMin();
        System.out.println("min2 => "+min2);

        obj.pop();
        int min3 = obj.getMin();
        System.out.println("min3 => "+min3);
    }
}

class MinStack {
    List<Integer> stack;
    List<Integer> min;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.min = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        if (min.isEmpty()) {
            min.add(val);
            return;
        }
        if (val < min.getLast()) {
            min.add(val);
        } else {
            min.add(min.getLast());
        }
    }

    public void pop() {
        stack.removeLast();
        min.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return min.getLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */