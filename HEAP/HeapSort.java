package HEAP;

public class HeapSort {
    private void  buildHeap(int [] arr,int n)
    {

    }
    private void heapify(int [] arr,int n,int i)
    {
        while(true)
        {
            int largest=i;
            int leftChild=2*i+1;
            int rightChild=2*i+2;

            if(leftChild<n && arr[leftChild]>arr[largest])
                largest=leftChild;
            if(rightChild<n && arr[rightChild]>arr[largest])
                largest=rightChild;
            if(largest==i)
                return;
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            i=largest;
        }
    }
    public static void main(String[] args) {
        int [] arr ={4,1,3,5,6,9};

    }

}
