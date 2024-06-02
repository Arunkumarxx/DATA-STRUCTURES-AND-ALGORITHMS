package ARRAYS;
public class RemoveDuplicatesFromASortedArray {
    static int  leftShit(int arr[] ,int n,int start) {
        for (int i=start ;i<n-1; i++){
            arr[i]=arr[i+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,2};
        int n= arr.length;
        int i=1;
        while (i<n){
            if (arr[i]==arr[i-1])
               n= leftShit(arr,n,i);
            else
                i++;
        }

        for (int j=0; j<n;j++)
            System.out.print(arr[j]+" ");
    }
}
