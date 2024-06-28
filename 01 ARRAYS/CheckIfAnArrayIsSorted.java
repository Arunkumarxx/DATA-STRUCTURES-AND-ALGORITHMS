package ARRAYS;
public class CheckIfAnArrayIsSorted {
    static boolean CheckIfAnArrayIsSorted(int arr[]) {
        int left = 0, right = arr.length - 1;

        while (left < right) {

            if (arr[left] > arr[left + 1] || arr[right] < arr[right - 1])
                return false;
            left++;

            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        int arr[] ={8,12,1,15};
      boolean res=   CheckIfAnArrayIsSorted(arr);
        System.out.println(res);
    }
}