package ARRAYS;
public class MaximumIndex {
    static  void MaximumIndex() {
        int a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n= a.length;
        int max=Integer.MIN_VALUE;
        for (int i=0; i<n ; i++){
            for (int j=i+1; j<n;j++){
                if (a[i]<=a[j]&&j-i>max) {
                    max = j - i;
                    System.out.println(i+" "+j );
                }
            }
        }
    }
    static void   MaximumIndexAlgo2(int arr[],int  n) {
        int[] Lmin = new int[n];
        int [] Rmax = new int[n];

        Rmax[n-1]=arr[n-1];
        for (int i=n-2; i>=0; --i)
            Rmax[i]=Integer.max(arr[i],Rmax[i+1]);
        Lmin[0]=arr[0];
        for (int i=1; i<n;i++)
            Lmin[i]=Integer.min(arr[i],Lmin[i-1] );
        for (int T:Rmax)
            System.out.print(T+" ");
        System.out.println();
        for (int T:Lmin)
            System.out.print(T+" ");
        int i=0,j=0;
        int max=-1;
        while (j<n&&i<n) {
            if(Lmin[i]<=Rmax[j]) {
                max = Integer.max(max, j - i);
                j++;
            }
            else i++;
        }
        System.out.println();
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] ={1,10};
        int n= arr.length;
        MaximumIndexAlgo2(arr,n);
    }
}
