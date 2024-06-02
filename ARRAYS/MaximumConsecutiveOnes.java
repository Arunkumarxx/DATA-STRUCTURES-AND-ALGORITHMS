package ARRAYS;
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int []  arr = {1,1,1,1,0,1,1,0,1,0,0};
        int n= arr.length;
        int currentCount=0;
        int maxCount=0;
        for (int i:arr)
            if (i==1) {
                currentCount++;
                maxCount=Math.max(currentCount,maxCount);
            }
        else currentCount=0;

    }
}