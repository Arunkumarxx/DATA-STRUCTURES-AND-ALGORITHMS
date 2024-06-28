package ARRAYS;
public class FrequenciesInASortedArray {
    static  void PrintFrequencies(int arr[],int n) {
        int freq = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] == arr[i])
                freq++;
            else {
                System.out.println("frequency of " + arr[i] + " is :" + freq);
                freq = 1;
            }
        }
        // Print frequency of the last element
        System.out.println("frequency of " + arr[n - 1] + " is :" + freq);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n= arr.length;
        PrintFrequencies(arr,n);
        int x=-1;
        x=x-1;
        System.out.println(x);
    }
}