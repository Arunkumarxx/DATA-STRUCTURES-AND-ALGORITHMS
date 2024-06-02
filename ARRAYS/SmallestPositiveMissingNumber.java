package ARRAYS;

class SmallestPositiveMissingNumber {
    static int missing(int[] arr,int n) {
        for (int i=0; i<n; i++){
            int currentPos=arr[i]-1;
            while (arr[i]>=1 &&  arr[i]<n &&  arr[i]!=arr[currentPos]){
                int temp=arr[i];
                arr[i]=arr[arr[i]];
                arr[arr[i]]=temp;
                currentPos=arr[i]-1;
            }
        }
        int j=0;
        for (; j<n; j++)
            if (arr[j]!=j+1)
                return j+1;
        return n+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5};
        int n= arr.length;
       int res=  missing(arr,n);
        System.out.println(res);

    }
}