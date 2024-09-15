package STACK;

public class InfixToPostfix {
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

    private static int getPrecedence(char c) {
        switch (c) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return -1;
        }
    }

    private static boolean isRightAssociative(char c) {
        return c == '^';
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static void main(String[] args) {
        InfixToPostfix stack = new InfixToPostfix();
        String str = "h^m^q^(7-4)";
        int n = str.length();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; ++i) {
            char c = str.charAt(i);

            // If the character is an operand (A-Z, a-z, or digit)
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            }
            // If the character is '(', push to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.top() != '(') {
                    res.append(stack.pop());
                }
                stack.pop();  // Remove '('
            }
            // If the character is an operator
            else if (isOperator(c)) {
                while (!stack.isEmpty() && getPrecedence(stack.top()) >= getPrecedence(c) &&
                        (!isRightAssociative(c) || getPrecedence(stack.top()) == getPrecedence(c))) {
                    res.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        System.out.println("Postfix Expression: " + res.toString());
    }
}
