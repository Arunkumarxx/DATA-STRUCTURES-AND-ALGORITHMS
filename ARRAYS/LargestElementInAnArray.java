package ARRAYS;
public class LargestElementInAnArray {
    public static void main(String[] args) {
        long first;
        first=Long.MIN_VALUE;

        int arr[] = {16,2,3};
        for (int i=0; i< arr.length; i++){
            if (arr[i]>first){
                first=arr[i];
            }
        }
        System.out.println(first);
    }
}
