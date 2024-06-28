package SORTING;
public class MergeFunctionOfMergeSort {
    static int merge(int []arr,int n,int low,int mid,int high) {
        int [] left = new int[mid-low+1];
        int [] right =new int[high-mid];
        for (int i=0; i< left.length; i++) left[i]=arr[i];
        for (int j=0; j<right.length; j++) right[j]=arr[mid+j+1];
        int ind1= left.length;
        int ind2=right.length;
        int i=0,j=0,k=0;
        while(i<ind1 && j<ind2)
        {
            if(left[i]<right[j])
            {
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
        while(i< ind1)
            arr[k++]=arr[i++];
        while(j< ind2)
            arr[k++]=arr[j++];



        return -1;
    }

    public static void main(String[] args) {
        int [] arr ={10,15,20,40,8,11,55};
        merge(arr, arr.length,0,3, 6);
        for (int x:arr) System.out.print(x+" ");
    }
}