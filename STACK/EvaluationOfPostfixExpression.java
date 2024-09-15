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
        EvaluationOfPostfixExpression stack =new EvaluationOfPostfixExpression();

        String str ="231*+9-";
        int n=str.length();
        for(int i=0; i<n;++i)
        {
            char c=str.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(c);
            }
           else
            {
                int first=stack.pop()-'';
                int second=stack.pop();

            }
        }
    }

}
