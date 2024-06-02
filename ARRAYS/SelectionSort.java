package ARRAYS;

class SelectionSort {
    static  void printArray(int arr[] ) {
        for (int tempArr:arr)
            System.out.print(tempArr+" ");
 
        System.out.println();
    }
    static void selectionSort(int arr[]) {
        // Here i use selection sort to sort Array
        /*
        approach bruteForce
        find largest or smallest element our wish  then swap it between them
         */
        int n= arr.length;
        for (int i =0; i<n-1;i++){
            for (int j=i+1; j<n; j++){
                if (arr[j]<arr[i]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
     public static void main(String[] args) {
         int arr[] = {64,25,12,22,11};
         System.out.println("UnSorted Array :");
         printArray(arr);
         selectionSort(arr);
         System.out.println("Sorted Array   :");
         printArray(arr);
     }
}

