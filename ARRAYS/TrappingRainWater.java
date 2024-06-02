package ARRAYS;
public class TrappingRainWater {
    public static void main(String[] args) {
        int [] arr  = {4,2,0,3,2,5};
        int n= arr.length;
        long left = 1;
        long right = n - 2;
        long leftMax = arr[0];
        long rightMax = arr[n - 1];
        long trappedWater = 0;

        while (left <= right) {
            if (leftMax >= rightMax) {
                if (arr[(int)right] <= rightMax) {
                    trappedWater += rightMax - arr[(int)right];
                    right--;
                } else {
                    rightMax = arr[(int)right];
                    right -= 1;
                }
            } else {
                if (arr[(int)left] <= leftMax) {
                    trappedWater += leftMax - arr[(int)left];
                    left++;
                } else {
                    leftMax = arr[(int)left];
                    left += 1;
                }
            }
        }
        System.out.println(trappedWater);
    }
}