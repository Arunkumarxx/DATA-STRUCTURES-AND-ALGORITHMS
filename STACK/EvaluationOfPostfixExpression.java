package STACK;

public class EvaluationOfPostfixExpression {
    private StackNode head;
    private class StackNode
    {
        int  data;
        StackNode next;
        StackNode(int value)
        {
            this.data=value;
            this.next=null;
        }
    }
    private void push(int value)
    {
        StackNode newNode = new StackNode(value);
        newNode.next=head;
        head=newNode;
    }
    private int pop()
    {
        if(head==null)
            return '\0';
        int  x =head.data;
        head=head.next;
        return x;
    }
    private void clear()
    {
        head=null;
    }
    private int top()
    {
        return head==null?'\0':head.data;
    }
    public static void main(String[] args) {
        EvaluationOfPostfixExpression stack =new EvaluationOfPostfixExpression();

        String str ="123+*8-";
        int n=str.length();
        for(int i=0; i<n;++i)
        {
            char c=str.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(c-'0');
            }
           else
            {
                int first=stack.pop()-48;
                int second=stack.pop()-48;
                if(c=='-')
                {
                    stack.push(second-first);
                }
                else if(c=='+')
                {
                    stack.push(second+first);
                }else if(c=='*')
                {
                    stack.push(second*first);
                }else if(c=='/')
                {
                    stack.push(second/first);
                }
            }
        }
        System.out.println(stack.top());
    }

}
