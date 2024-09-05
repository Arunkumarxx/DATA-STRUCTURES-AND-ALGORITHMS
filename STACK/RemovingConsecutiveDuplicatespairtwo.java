package STACK;

public class RemovingConsecutiveDuplicatespairtwo {
    private StackNode head;

    private class StackNode {
        char data;
        StackNode next;

        StackNode(char data)
        {
            this.data=data;
            this.next=null;
        }
    }

    private void push(char data) {

        if(data==head.data) {
            head = head.next;
            return;
        }
        StackNode newNode = new StackNode(data);
        newNode.next = head;
        head = newNode;
    }

    private char pop()
    {
        char x=head.data;
        head=head.next;
        return x;
    }

    public static void main(String[] args) {
        String str= "aaaa";
        RemovingConsecutiveDuplicatespairtwo stack =new RemovingConsecutiveDuplicatespairtwo();
        for(int i=str.length()-1;i>=0;--i)
        {
            stack.push(str.charAt(i));
        }
        String res= "";
        while(stack.pop()!=' ')
        {
            res+=stack.pop();
        }
        System.out.println(res);
    }

}
