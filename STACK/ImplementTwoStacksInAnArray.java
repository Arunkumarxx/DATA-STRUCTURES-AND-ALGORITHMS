package STACK;

public class ImplementTwoStacksInAnArray {

    private StackNode head;
    class  StackNode {

    }
    private int [] stack;
    private int size1;
    private int size2;

    twoStacks() {
        this.stack=new int[10];
        this.size1=0;
        this.size2=stack.length-1;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        if(size1>size2)
            resize();
        stack[size1++]=x;
    }
    void resize()
    {
        int newSize=stack.length*2;
        int [] arr =new int [newSize];

        for(int i=0; i<size1;++i)
            arr[i]=stack[i];

        int newSize2=newSize-1;

        for(int j=stack.length-1;j>size2;--j){
            arr[newSize2--]=stack[j];
        }
        size2=newSize2;
        stack=arr;
    }
    // Function to push an integer into the stack2.
    void push2(int x) {
        if(size1>size2)
            resize();
        stack[size2--]=x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(size1>0)
            return stack[--size1];
        return -1;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(size2<stack.length-1)
            return stack[++size2];
        return -1;
    }
    public static void main(String[] args) {

    }

}
