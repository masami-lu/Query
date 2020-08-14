package book.four;

import java.util.Stack;

public class Ti30 {
    Stack<Integer> A, B;
    public void MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }
    public void push(int x) {
        A.push(x);
        if(B.empty() || B.peek() >= x)
            B.push(x);
    }
    public void pop() {
        if(A.pop().equals(B.peek()))
            B.pop();
    }
    public int top() {
        return A.peek();
    }
    public int min() {
        return B.peek();
    }
}
