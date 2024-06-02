package ARRAYS;
public class EquilibriumIndexOfAnArray {
    public static int findEquilibriumPoint(int[] arr,int n) {
        long total=0;
        for(long  i=0;i<n;i++)
            total+=arr[(int) i];
        //sum =1 to n;
        long leftSum=0;
        for(long j=0; j<n;j++){
            leftSum+=arr[(int) j];
            if(leftSum==total)
                return (int) (j+1);
            total-=arr[(int) j];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("Equilibrium Point for arr1: " + findEquilibriumPoint(arr1, arr1.length));
    }


}
