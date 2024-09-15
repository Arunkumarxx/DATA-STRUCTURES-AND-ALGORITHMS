package STACK;

public class EvaluationOfPostfixExpression {
    private StackNode head;
    private class StackNode
    {
        char data;
        StackNode next;
        StackNode(char value)
        {
            this.data=value;
            this.next=null;
        }
    }
    private void push(char value)
    {
        StackNode newNode = new StackNode(value);
        newNode.next=head;
        head=newNode;
    }
    private char pop()
    {
        if(head==null)
            return '\0';
        char x =head.data;
        head=head.next;
        return x;
    }
    private void clear()
    {
        head=null;
    }
    private char top()
    {
        return head==null?'\0':head.data;
    }
    public static void main(String[] args) {
        
    }

}
