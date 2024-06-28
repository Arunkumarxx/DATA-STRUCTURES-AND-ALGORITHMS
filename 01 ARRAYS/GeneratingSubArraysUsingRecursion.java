package ARRAYS;

class GeneratingSubArraysUsingRecursion {
    static void PrintSubArrayUsingRecursion(int[] arr,int start,int end) {
        if (end == arr.length){
            /*
            stop recursion function
             */
        }
         else if (start > end) {
             PrintSubArrayUsingRecursion(arr,0,end+1);
        }
         else {
            System.out.print("[");
            for (int i = start; i< end; i++){
                System.out.print(arr[i]+",");
            }
            System.out.println(arr[end]+"]");
            PrintSubArrayUsingRecursion(arr,start+1,end);
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        PrintSubArrayUsingRecursion(arr,0,0);
    }
}
/*
we use two pointer to  explore all  subarrays possible  start and end
then we check if end == arr.length to break recursion function
else if then  check for start greater than end true it means we needed to start over again to explore other sub arrays
else if none of the condition meet then print and increment start+1
 */