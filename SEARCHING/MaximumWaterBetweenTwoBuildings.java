package SEARCHING;
public class MaximumWaterBetweenTwoBuildings {
    public static void main(String[] args) {
        int [] height = {2,1};
        int n=height.length;
        int left=0;
        int right=n-1;
        int sum=0;
        int max=0;
        int diff=n-2;
        while(left<right)
        {
            int area=(right-left)*diff;
            max=Math.max(area,max);
                if(height[left]<height[right]) {
                    left++;
                    diff--;
                }
                else {
                    right--;
                    diff--;
                }
        }
        System.out.println(max);
    }
}
