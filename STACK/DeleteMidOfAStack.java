package STACK;

import java.util.Stack;

public class DeleteMidOfAStack {

    public void deleteMid(Stack<Integer> s, int n) {
        delete(s, n / 2);
    }

    private void delete(Stack<Integer> s, int mid) {
        if (mid == 0) {
            s.pop();
            return;
        }
        int x = s.pop();
        delete(s, mid - 1);
        s.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack before : " + stack);

        DeleteMidOfAStack obj = new DeleteMidOfAStack();
        obj.deleteMid(stack, stack.size());

        System.out.println("Stack after : " + stack);
    }
}
