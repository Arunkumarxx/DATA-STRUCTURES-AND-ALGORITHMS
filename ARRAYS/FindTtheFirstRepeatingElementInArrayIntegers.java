package ARRAYS;

class FindTtheFirstRepeatingElementInArrayIntegers {
    static int repeating(int arr[],int n) {
        for (int i =0; i <n ; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i]==arr[j])
                return i;
            }
        }
        return -1;
    }

     public static void main(String[] args) {
        int arr[]  ={1,5,3,4,3,5,6};
        int n = arr.length;
        int result = repeating(arr,n);
         if (result == -1 ){
             System.out.println("Not valid");
         }
         else System.out.println(arr[result]);
     }
}
