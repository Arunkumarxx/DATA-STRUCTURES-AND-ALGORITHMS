package STACK;

public class InfixToPostfix {
    private StackNode head;
    private class StackNode {
        char value;
        StackNode next;
        StackNode(char value)
        {
            this.value=value;
            this.next=null;
        }
    }
    private void push(char value)
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
    private boolean isEmpty()
    {
        return head==null;
    }
    private void clear()
    {
        head=null;
    }
    private void print()
    {
        StackNode temp =head;
        while(temp!=null)
        {
            System.out.println("|"+temp.value+"|");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        InfixToPostfix stack =new InfixToPostfix();
        String str ="((A+B)-C*(D/E))+F";
        int n=str.length();
        StringBuilder res =new StringBuilder();
        for(int i=0; i<n;++i)
        {
            char c=str.charAt(i);
            if(c=='(')
            {
                stack.push(c);
                continue;
            }
            if(c>='a' && c<='z')
                res.append(c);
        }
    }
    private static int getPrecendence(char c)
    {
        switch (c)
        {
            case '^':return 1;
            case '*':return 2;
            case '/':return 2;
            case '+':return 3;
            case '-':return 3;

        }
    }
}
