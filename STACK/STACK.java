package STACK;

public class STACK {
    private int[] arr;
    private int size;

    public STACK() {
        this.size = 0;
        this.arr = new int[10];
    }

    public void push(int value) {
        if (size == arr.length) {
            resize();
        }
        arr[size] = value;
        ++size;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int res = arr[size - 1];
        arr[size - 1] = 0;
        --size;
        return res;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void resize() {
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    public void print() {
        for (int i = size - 1; i >= 0; --i) {
            System.out.println("|" + arr[i] + "|");
        }
    }

    public static void main(String[] args) {
        STACK stack = new STACK();
        int[] arr = {10, 20, 30, 50, 10, 70, 30};

        int n = arr.length;
        long[] res = new long[n];
        for (int i = n - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.pop()] >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? n : stack.pop();
            stack.push(i);
        }

        for (long r : res) {
            System.out.print(r + " ");
        }
    }
}
