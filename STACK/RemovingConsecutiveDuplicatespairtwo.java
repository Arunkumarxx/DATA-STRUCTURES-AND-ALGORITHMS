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
        String str= "aaabbaaccd";
        int c=1;
        int i=str.length()-1;
        RemovingConsecutiveDuplicatespairtwo stack =new RemovingConsecutiveDuplicatespairtwo();
        while(i!=1)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                stack.push(str.charAt(i));
                stack.push(str.charAt(i));
                while(str.charAt(i)==str.charAt(i-1))
                    --i;
            }
            else {
                stack.push(str.charAt(i));
                --i;
            }
        }
        if(str.charAt(0)!=str.charAt(1))
            stack.push(str.charAt(0));
        String result="";
        while(stack.head!=null)
        {
            result+=stack.pop();
        }
        System.out.println(result);
    }

}
