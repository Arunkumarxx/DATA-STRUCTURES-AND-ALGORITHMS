package STACK;

public class DesignAStackThatSupportsGetminInO1TimeAndO1ExtraSpace {
    private StackNode head;
    private class StackNode{
        int value;
        int min;
        StackNode next;

        StackNode(int value,int min)
        {
            this.value=value;
            this.min=min;
        }
    }
    private StackNode top ()
    {
        return head;
    }
    DesignAStackThatSupportsGetminInO1TimeAndO1ExtraSpace ()
    {
        head=null;
    }

    int getMin()
    {
        if(head==null)
            return -1;
        return head.min;
    }


    int pop()
    {
        if(head==null)
            return -1;
        int value=head.value;
        head=head.next;
        return value;
    }

    void push(int x)
    {
        if(head==null){
            StackNode newNode =new StackNode(x,x);
            newNode.next=head;
            head=newNode;
        }
        else
        {
            int min=top().min;
            if(x<min)
            {
                StackNode newNode = new StackNode(x,x);
                newNode.next=head;
                head=newNode;
            }
            else
            {
                StackNode newNode =  new StackNode(x,min);
                newNode.next=head;
                head=newNode;
            }
        }
    }
    public static void main(String[] args) {
        DesignAStackThatSupportsGetminInO1TimeAndO1ExtraSpace  stack = new DesignAStackThatSupportsGetminInO1TimeAndO1ExtraSpace();
        stack.push(1);
        stack.push(32);
        stack.push(-2);
        stack.pop();
        System.out.println(stack.getMin());
        stack.push(-23);
        System.out.println(stack.getMin());
    }

}
