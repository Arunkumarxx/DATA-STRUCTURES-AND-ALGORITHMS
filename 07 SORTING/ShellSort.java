package SORTING;
public class ShellSort {
    private  static void swap(int [] first,int [] second,int l,int r) {
        if(first[l]>second[r]) {
            int temp = first[l];
            first[l] = second[r];
            second[r] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr1 ={1,3,5,7};
        int [] arr2 ={0,2,6,8,9};
        int gap=(arr1.length+arr2.length)/2+(arr1.length+arr2.length)%2;
        int len=arr1.length+arr2.length;
        int len1=arr1.length;
        int len2=arr2.length;
        while(gap>=1)
        {
            int left=0;
            int right=left+gap;
            while(right<len)
            {
                if(left<len1 && right>=len1)
                {
                        swap(arr1,arr2,left,right-len1);

                }
                else if(left>=len1){

                        swap(arr2,arr2,left-len1,right-len1);

                }
                else {
                        swap(arr1, arr1, left, right);
                }
                left++;right++;
            }if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
        for (int x:arr1) System.out.print(x+" ");
        System.out.println();
        for (int y:arr2) System.out.print(y+" ");


    }
}
