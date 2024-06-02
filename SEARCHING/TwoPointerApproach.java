package SEARCHING;
public class TwoPointerApproach {
    static boolean some () {
        int x = 17;
        int sum = 0;
        int [] arr ={2,5,8,12,30};
        int n= arr.length;
        int i=0, j=n-1;
        while (i<j){

            if (arr[i] + arr[j] == x)
                return true;
            else if (arr[i] + arr [j] <x)i++;
            else j--;
        }

        return false;
    }
    public static void main(String[] args) {
      int [] arr ={2,5,8,12,30};
     boolean res= some();
        System.out.println(res);
    }
 }
