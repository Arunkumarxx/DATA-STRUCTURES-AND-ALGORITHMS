package SEARCHING;
public class FindPeakElement {
    static int peak(int []arr ) {
        int n=arr.length;
        if (n<=2)
            return arr[0];
        int p=-1;
        for (int i=0; i<n; i++)
        {
            if(i==0) {
                if (arr[i] > arr[i + 1])
                    p = arr[i];
            }
            else if(i==n-1)
            {
                if(arr[i]>arr[i-1])
                    p=arr[i];
            }
            else if (arr[i]>=arr[i-1] && arr[i] >=arr[i+1])
                p=arr[i];
        }
        return p;
    }
    public static void main(String[] args) {
        int [] arr ={80,70,60};
       int res= peak(arr);
        System.out.println(res);
    }
}
