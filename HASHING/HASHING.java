package HASHING;

import java.util.Scanner;

public class HASHING {
    public static void main(String[] args) {
        System.out.println(isSumPalindrome(23));
    }
    static long isSumPalindrome(long n) {
        // code here
        long res=0;
        long tempn=n;
        while(tempn!=0)
        {
            res=(res*10)+(tempn%10);
            tempn/=10;
        }
        String str=Long.toString(res+n);
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
                return -1;
            ++start;
            --end;
        }
        return  res+n;
    }
}

 class LCMQueries {

    // Function to find LCM of given range.
    public static long getLCM(long st[], long arr[], int n, int qs, int qe) {
        if (qs > qe || qs >= n || qe < 0) {
            return 1;
        }
        if (qs <= 0 && qe >= n - 1) {
            return st[0];
        }
        int mid = (qs + qe) / 2;
        long leftLCM = getLCM(st, arr, n, qs, mid);
        long rightLCM = getLCM(st, arr, n, mid + 1, qe);
        return (leftLCM * rightLCM) / gcd(leftLCM, rightLCM);
    }

    // Function to update a value in the input array and segment tree.
    public static void updateValue(long arr[], long st[], int n, int index, long new_val) {
        arr[index] = new_val;
        updateSegmentTree(st, arr, 0, n - 1, index, new_val);
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static void updateSegmentTree(long st[], long arr[], int ss, int se, int index, long new_val) {
        if (index < ss || index > se) {
            return;
        }
        if (ss == se) {
            st[index] = new_val;
        } else {
            int mid = (ss + se) / 2;
            updateSegmentTree(st, arr, ss, mid, index * 2 + 1, new_val);
            updateSegmentTree(st, arr, mid + 1, se, index * 2 + 2, new_val);
            st[index] = (st[index * 2 + 1] * st[index * 2 + 2]) / gcd(st[index * 2 + 1], st[index * 2 + 2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        long[] st = new long[4 * N]; // Adjust the size as needed
        // Build the segment tree (you mentioned it's prebuilt)

        for (int i = 0; i < Q; i++) {
            char queryType = sc.next().charAt(0);
            if (queryType == 'G') {
                int L = sc.nextInt();
                int R = sc.nextInt();
                System.out.println(getLCM(st, arr, N, L, R));
            } else if (queryType == 'U') {
                int index = sc.nextInt();
                long val = sc.nextLong();
                updateValue(arr, st, N, index, val);
            }
        }
    }
}
public static long getLCM(long st[], long arr[], int n, int qs, int qe) {
    return getLCMUtil(st, 0, n - 1, qs, qe, 0);
}

public static long getLCMUtil(long st[], int ss, int se, int qs, int qe, int si) {
    // If segment of this node is a part of the given range
    if (qs <= ss && qe >= se) {
        return st[si];
    }

    // If segment of this node is outside the given range
    if (se < qs || ss > qe) {
        return 1; // LCM of an empty set is defined as 1
    }

    // If a part of this segment overlaps with the given range
    int mid = getMid(ss, se);
    long leftLCM = getLCMUtil(st, ss, mid, qs, qe, 2 * si + 1);
    long rightLCM = getLCMUtil(st, mid + 1, se, qs, qe, 2 * si + 2);

    return LCM(leftLCM, rightLCM);
}
