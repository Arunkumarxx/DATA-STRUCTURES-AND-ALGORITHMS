package STACK;

public class InfixToPrefix {
    private StackNode head;

    private class StackNode {
        char value;
        StackNode next;
        StackNode(char value) {
            this.value = value;
            this.next = null;
        }
    }

    private void push(char value) {
        StackNode newNode = new StackNode(value);
        newNode.next = head;
        head = newNode;
    }

    private char top() {
        return head != null ? head.value : '\0';
    }

    private char pop() {
        if (head == null) return '\0';
        char res = head.value;
        head = head.next;
        return res;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {

    }

}
