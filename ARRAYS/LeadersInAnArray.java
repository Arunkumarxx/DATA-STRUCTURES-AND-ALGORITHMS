package ARRAYS;
 public   class LeadersInAnArray {
     static void LeadersInAnArray1(int[] arr,int n) {

        for (int i=0; i<n; i++){
            int total=0;
            for (int j=i+1; j<n; j++){
                total+=arr[j];
            }
            if (arr[i]>total){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void LeadersInAnArray2(int[] arr,int n) {
        int store=0;
        for (int i=n-1; i>0;i--){
            if (i==n-1){
                System.out.print(arr[i]+" ");
            }
            store+=arr[i];
                if (arr[i-1]>store){
                    System.out.print(arr[i-1]+" ");
              }
        }
    }
     public static void main(String[] args) {
        int [] arr = {16, 17, 4, 3, 5, 2};
        int n= arr.length;
        LeadersInAnArray1(arr,n);
         System.out.println();
        LeadersInAnArray2(arr,n);
     }
}
