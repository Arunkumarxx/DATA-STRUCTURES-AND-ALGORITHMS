package ARRAYS;

// brute force approach
 class GeneratingSubArraysUsingIterative {
    static void GeneratingSubArrayUsingIterative(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++){
            //outerloop  control 1,2,3,4 order
            for (int j=i; j<n; j++ ){
                //inter loop control i order to n order;
                for (int k=i; k<=j; k++){
                    // nested inner loop print i order to j order
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String...args) {
        int[] array = {1,2,3};
        GeneratingSubArrayUsingIterative(array);
    }
}
