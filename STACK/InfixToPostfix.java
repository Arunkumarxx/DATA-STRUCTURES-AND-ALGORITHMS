package STACK;

public class InfixToPostfix {
    private StackNode head;
    private class StackNode {
        int value;
        StackNode next;
        StackNode(int value)
        {
            this.value=value;
            this.next=null;
        }
    }
    private void push(int value)
    {
        StackNode newNode =new StackNode(value);
        newNode.next=head;
        head=newNode;
    }
    private int top()
    {
        return head.value;
    }
    private int pop()
    {
        int res=head.value;
        head=head.next;
        return res;
    }
    public static void main(String[] args) {

    }

}
