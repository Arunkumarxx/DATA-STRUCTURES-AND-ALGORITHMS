package ARRAYS;

class FindSubArrayWithGivenSum {
     static void SubArrayWithGivenSum1(int [] arr,int n,int sum) {
         boolean X=  true;
     for (int i=0; i<n && X == true; i++){
               int total=arr[i];
               for (int j=i+1; j<n; j++){
                    total+=arr[j];
                    if (total==sum){
                        System.out.println("Sum found between indexes "+(i)+" and "+j);
                        X=false;
                    }
               }
          }
     }
     static void SubArrayWithGivenSum2(int[] arr,int n,int sum) {

     }

  public static void main(String[] args) {
     int [] arr = {1, 4, 0, 0, 3, 10, 5 };
     //  1 to n-1;
      // currentsum == sum return end-1
      //
     int n= arr.length;
     int sum=7;
   SubArrayWithGivenSum1(arr,n,sum);


     }
}
