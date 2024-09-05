package STACK;

public class RemovingConsecutiveDuplicates {
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

    private void push(char data)
    {
        if(head==null)
            insertIntoStack(data);
        else
            if(head.data!=data)
                insertIntoStack(data);
    }

    private void insertIntoStack(char data)
    {
        StackNode newNode =new StackNode(data);
        newNode.next=head;
        head=newNode;
    }
    private char pop(char data)
    {
        char x= head.data;

    }

    public static void main(String[] args) {
        String input="aaaaabaabcccc";
        RemovingConsecutiveDuplicates stack =new RemovingConsecutiveDuplicates();

        for(int i=0; i<input.length();++i)
            stack.push(input.charAt(i));
        String result="";
        while(stack.head)

    }

}
