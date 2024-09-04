package STACK;

public class BalancedParenthesis {
    private StackNode head;
    private  class StackNode {
        char data;
        StackNode next;
        StackNode(char value)
        {
            data=value;
            next=null;
        }
    }
    private void push(char value)
    {
        StackNode  newNode =new StackNode(value);
        newNode.next=head;
        head=newNode;
    }
    private char pop() {
        char res = 0;
        if (head != null) {
            res = head.data;
            head = head.next;
            return res;
        }
        return ' ';
    }
    private void print()
    {
        StackNode temp=head;
        while(temp!=null)
        {
            System.out.println("| "+temp.data+" |");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        BalancedParenthesis stack =new BalancedParenthesis();
        stack.push('(');
        stack.push('(');
        stack.push(')');
        stack.push(')');
        stack.print();
    }
}
