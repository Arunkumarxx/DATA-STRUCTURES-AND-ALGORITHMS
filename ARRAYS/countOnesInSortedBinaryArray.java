package ARRAYS;

class countOnesInSortedBinaryArray {
    static int counOnesBinarySearch(int[] arr, int len) {
        int l=0,r=len-1;
        while (l<=r){
            int m=l+(r-l)/2;
            if (arr[m]<1){
                r=m-1;
            }if (arr[m]>1){
                l=m+1;
            }
            else {
                if (m==len-1||arr[m]!=1){
                    return m+1;
                }
                else l=m+1;
                System.out.println("welcome");
                System.out.println("welcome ");

            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr ={1,1,0,0,0,0,0};
        int[] arr2 ={1,1,1,1,1,1,1};
        int result1 =counOnesBinarySearch(arr,arr.length);
        int result2 = counOnesBinarySearch(arr2,arr2.length);
        System.out.println(result1);
        System.out.println(result2);
    }
}