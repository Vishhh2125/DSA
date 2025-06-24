import java.util.Stack;

class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            min = val;
            stack.push((long) val);
        } else if (val >= min) {
            stack.push((long) val);
        } else {
            // store encoded value
            stack.push(2L * val - min);
            min = val;
        }
    }

    public void pop() {
        long top = stack.pop();
        if (top < min) {
            // decode previous min
            min = 2L * min - top;
        }
    }

    public int top() {
        long top = stack.peek();
        if (top >= min) {
            return (int) top;
        } else {
            return (int) min;
        }
    }

    public int getMin() {
        return (int) min;
    }
}
