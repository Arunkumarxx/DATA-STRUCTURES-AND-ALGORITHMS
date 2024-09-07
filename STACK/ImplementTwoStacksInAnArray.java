package STACK;

public class ImplementTwoStacksInAnArray {
    private int[] stack;
    private int size1;
    private int size2;

    public ImplementTwoStacksInAnArray() {
        this.stack = new int[10];
        this.size1 = 0;
        this.size2 = stack.length - 1;
    }

    void push1(int x) {
        if (size1 > size2) {
            resize();
        }
        stack[size1++] = x;
    }

    void push2(int x) {
        if (size1 > size2) {
            resize();
        }
        stack[size2--] = x;
    }

    int pop1() {
        if (size1 > 0) {
            return stack[--size1];
        }
        return -1;
    }

    int pop2() {
        if (size2 < stack.length - 1) {
            return stack[++size2];
        }
        return -1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void resize() {
        int newSize = stack.length * 2;
        int[] arr = new int[newSize];

        for (int i = 0; i < size1; ++i) {
            arr[i] = stack[i];
        }

        int newSize2 = newSize - 1;

        for (int j = stack.length - 1; j > size2; --j) {
            arr[newSize2--] = stack[j];
        }

        size2 = newSize2;
        stack = arr;
    }

    public static void main(String[] args) {
        ImplementTwoStacksInAnArray stacks = new ImplementTwoStacksInAnArray();
        stacks.push1(5);
        stacks.push2(10);
        System.out.println(stacks.pop1());
        System.out.println(stacks.pop2());
    }
}
