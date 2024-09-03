package STACK;

public class STACK {
    private int [] arr ;
    private  int size;

    public STACK()
    {
        this.size=-1;
        this.arr=new  int [10];
    }
    public void push(int value)
    {
        if(size==arr.length)
            resize();
            else arr[++size]=value;
    }
    public int  pop ()
    {
        return arr[--size];
    }
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }
    public void resize()
    {
        int [] newArr =new int[size*2];
        for(int i=0; i<size;++i)
        {
            newArr[i]=arr[i];
        }
        arr=newArr;
    }
    public void print()
    {
        for(int i=0; i<=size;++i)
            System.out.print(arr[i]);

    }
    public static void main(String[] args) {
        STACK stack =new STACK();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
    }
    
}
