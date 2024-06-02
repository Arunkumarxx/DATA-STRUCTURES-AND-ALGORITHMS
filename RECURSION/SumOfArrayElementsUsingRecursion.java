package RECURSION;

class SumOfArrayElementsUsingRecursion {
    static int total=0;
    static void SumOfElementsUsingRecursion(int [] arr,int n) {
        if (n==0) {
            System.out.println(total);
            return;
        }
        total+=arr[n-1];
        SumOfElementsUsingRecursion(arr,n-1);









    }
    public static void main(String[] args) {
        int []arr = {15,12,13,10};
        int n= arr.length;
        SumOfElementsUsingRecursion(arr,n);
    }
}
