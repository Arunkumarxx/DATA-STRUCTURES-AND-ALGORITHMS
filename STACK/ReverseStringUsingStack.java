package STACK;

public class ReverseStringUsingStack {
    private StackNode head;
    private class StackNode
    {
        char data;
        StackNode next;

        StackNode(char data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private void  push(char value)
    {
        StackNode newNode=new StackNode(value);
        newNode.next=head;
        head=newNode;
    }

    private char  pop()
    {
        if(head==null)
            return ' ';
        char x=head.data;
        head=head.next;
        return x;
    }
    public static void main(String[] args) {
        String input="GeeksforGeeks";
        ReverseStringUsingStack stack =new ReverseStringUsingStack();
        for(int i=0; i<input.length(); ++i)
            stack.push(input.charAt(i));
        String result="";
        while (stack.head!=null)
        {
            result+=stack.pop();
        }
        System.out.println(result);
    }
}
