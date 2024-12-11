package TREE;

public class RangeGreatestCommonDivisorQueriesUsingTrie
{
    private static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }

    private static void buildSegmentTree(int arr[], int st[], int start, int end, int node)
    {
        if(start==end)
        {
            st[node]=arr[start];
            return;
        }
        int mid=(start+end)/2;
        buildSegmentTree(arr, st, start, mid, 2*node+1);
        buildSegmentTree(arr, st, mid+1, end, 2*node+2);
        st[node]=gcd(st[2*node+1], st[2*node+2]);
    }

    public static int findRangeGcd(int l, int r, int st[], int n)
    {
        return rangeGcdUtil(st, 0, n-1, l, r, 0);
    }

    private static int rangeGcdUtil(int st[], int start, int end, int l, int r, int node)
    {
        if(start>r||end<l)
            return 0;

        if(start>=l&&end<=r)
            return st[node];

        int mid=(start+end)/2;
        int leftGcd=rangeGcdUtil(st, start, mid, l, r, 2*node+1);
        int rightGcd=rangeGcdUtil(st, mid+1, end, l, r, 2*node+2);
        return gcd(leftGcd, rightGcd);
    }

    public static void updateValue(int index, int new_val, int arr[], int st[], int n)
    {
        arr[index]=new_val;
        updateValueUtil(st, 0, n-1, index, new_val, 0);
    }

    private static void updateValueUtil(int st[], int start, int end, int index, int new_val, int node)
    {
        if(start==end)
        {
            st[node]=new_val;
            return;
        }

        int mid=(start+end)/2;
        if(index<=mid)
            updateValueUtil(st, start, mid, index, new_val, 2*node+1);
        else
            updateValueUtil(st, mid+1, end, index, new_val, 2*node+2);
        st[node]=gcd(st[2*node+1], st[2*node+2]);
    }

    public static void main(String[] args)
    {
        int arr[]={2, 3, 4, 6, 8, 16};
        int n=arr.length;
        int[] st=new int[4*n];
        buildSegmentTree(arr, st, 0, n-1, 0);
        System.out.println(findRangeGcd(0, 2, st, n));
        updateValue(3, 8, arr, st, n);
        System.out.println(findRangeGcd(2, 5, st, n));
    }

}
