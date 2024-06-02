package ARRAYS;

class SortAnArrayWhichContain1TonValues {
    static void Sort1(int [] arr,int n) {
        int t;
        // find smallest element and place it ascending order
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[j]<arr[i]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for (int print:arr){
            System.out.print(print+" ");
        }
    }
    static void Sort2(int[] arr,int n) {
        int count = 0, start = 0, end = n;
        while (start < end - 1 && count < n) {
            if (arr[start] > arr[count]) {
                swap(arr, start, count);
            }
            count++;
            if (count == n) {
                count = start + 1;
                start++;
            }
        }
        for (int print:arr){
            System.out.print(print+" ");
        }

    }
        static void swap(int[] arr,int a,int y) {
            int t;
            t=arr[y];
            arr[y]=arr[a];
            arr[a]=t;
        }




     public static void main(String[] args) {
         int[] arr ={10,7,9,2,8,3,5,4,6,1};
         int n =arr.length;
         Sort2(arr,n);

     }
}
