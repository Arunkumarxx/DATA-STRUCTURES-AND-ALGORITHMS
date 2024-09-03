package STACK;

public class STACK {
    private int [] arr ;
    private  int size;

    public STACK()
    {
        this.size=0;
        this.arr=new  int [10];
    }
    public void push(int value)
    {
        if(size==arr.length)
            resize();
            else {
            arr[size] = value;
            ++size;
        }
    }
    public int  pop ()
    {
        if(isEmpty())
            return -1;
        int res= arr[size];
        arr[size]=0;
        --size;
        return res;
    }
    public boolean isEmpty() {
        return size==0;
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
        stack.print();
    }
    
}
