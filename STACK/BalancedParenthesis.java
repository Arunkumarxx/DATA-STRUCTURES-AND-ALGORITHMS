package STACK;

public class BalancedParenthesis {
    private StackNode head;
    private  class StackNode {
        char data;
        StackNode next;
        StackNode(char value)
        {
            data=value;
            next=null;
        }
    }
    private void push(char value)
    {
        StackNode  newNode =new StackNode(value);
        newNode.next=head;
        head=newNode;
    }
    private char pop() {
        char res = 0;
        if (head != null) {
            res = head.data;
            head = head.next;
            return res;
        }
        return ' ';
    }
    private void print()
    {
        StackNode temp=head;
        while(temp!=null)
        {
            System.out.println("| "+temp.data+" |");
            temp=temp.next;
        }
    }

    private static void  isBalanced()
    {
        BalancedParenthesis stack =new BalancedParenthesis();
        String  str ="(())";
        for(int i=0; i<str.length();++i)
        {
            if(isValidPush(str.charAt(i)))
                stack.push(str.charAt(i));
            else if(stack.head==null )
            {
                System.out.println("Invalid ");
                return;
            }
            else {
                char val=stack.pop();
                if(!isClosed(val))
                {
                    System.out.println("Invalid ");
                    return;
                }
            }
        }
        System.out.println("valid");

        stack.print();
    }
    public static void main(String[] args) {
        isBalanced();
    }
    private static boolean isClosed(char c)
    {
        if(c==')')
            return  c-1=='(';
        if(c=='}')
            return c-2=='[';
        if(c=='{')
            return c-2=='{';

        return false;
    }
    private static boolean isValidPush(char c)
    {
        switch (c)
        {
            case '(':return  true;
            case '{':return true;
            case '[':return true;
            default: return false;
        }
    }
}
