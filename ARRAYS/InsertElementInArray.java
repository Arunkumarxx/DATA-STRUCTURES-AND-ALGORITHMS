package ARRAYS;

public class InsertElementInArray {
    static void   InsertElementArray(int arr[],int n,int key,int pos) {
        if(pos==n-1)
        {
            arr[pos]=key;
            return ;
        }

        for( int i=n-1; i >key; i--){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        arr[pos]=key;
    }
    public static void main(String[] args) {
        int arr[] =new int[4];
        arr[0]=5;
        arr[1]=10;
        arr[2]=20;
        int key=7,pos=3;
        int n=3;
        InsertElementArray(arr, n,key,pos);
       for (int temp:arr)
           System.out.print(temp+" ");
    }
}
