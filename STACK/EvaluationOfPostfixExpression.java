package STACK;

public class EvaluationOfPostfixExpression {
    private StackNode head;
    private class StackNode
    {
        char data;
        StackNode next;
        StackNode(char value)
        {
            this.data=value;
            this.next=null;
        }
    }
    private void push(char value)
    {
        StackNode newNode = new StackNode(value);
        newNode.next=head;
        head=newNode;
    }
    private 
    public static void main(String[] args) {

    }

}
