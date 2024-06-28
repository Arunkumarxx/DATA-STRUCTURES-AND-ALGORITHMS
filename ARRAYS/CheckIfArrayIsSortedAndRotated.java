package ARRAYS;
public class CheckIfArrayIsSortedAndRotated {
    public static boolean checkRotatedAndSorted(int arr[], int num){
        int count=0;
        for (int i=1; i<num;i++){
            if (arr[i]<arr[i-1])
                count++;
        }
        if (count==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int arr[] ={6,2,3,4,5};
        System.out.println(checkRotatedAndSorted(arr, arr.length));
    }
}