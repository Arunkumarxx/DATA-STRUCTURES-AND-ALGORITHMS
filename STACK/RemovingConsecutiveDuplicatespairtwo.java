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

    public static void main(String[] args) {

    }

}
