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
        String str = "(A – B/C) * (A/K-L)";
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        StringBuilder newString=new StringBuilder();
        for(int i=0; i<str.length();++i)
        {
            if(str.charAt(i)=='(')
                newString.append(')');
            else if(str.charAt(i)==')')
                newString.append('(');
            else newString.append(str.charAt(i));
        }
        System.out.println(newString);
        str=rev.toString();
        int n = str.length();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; ++i) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.top() != '(') {
                    res.append(stack.pop());
                }
                stack.pop();
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && getPrecedence(stack.top()) >= getPrecedence(c) &&
                        (!isRightAssociative(c) || getPrecedence(stack.top()) == getPrecedence(c))) {
                    res.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        System.out.println("Postfix Expression: " + res.reverse());

    }
}
