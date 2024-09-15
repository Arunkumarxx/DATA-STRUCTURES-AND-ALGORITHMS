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
        for(int i=0; i<n;++i)
        {

        }
    }
    private static int getPrecendence(char c)
    {
        switch (c)
        {
            
        }
    }
}
