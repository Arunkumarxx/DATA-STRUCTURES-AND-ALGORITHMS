package SORTING;

import java.util.ArrayList;

public class MergeThreeSortedArrays {
    private static void swap(int[] first, int[] second, int l, int r) {
        int temp = first[l];
        first[l] = second[r];
        second[r] = temp;
    }
    static void method(int arr1[],int arr2[]) {
        int gap = (arr1.length + arr2.length) / 2 + (arr1.length + arr2.length) % 2;
        int len = arr1.length + arr2.length;
        int len1 = arr1.length;
        int len2 = arr2.length;

        while (gap >= 1) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                if (left < len1 && right >= len1) {
                    if (arr1[left] > arr2[right - len1]) {
                        swap(arr1, arr2, left, right - len1);
                    }
                } else if (left >= len1) {
                    if (arr2[left - len1] > arr2[right - len1]) {
                        swap(arr2, arr2, left - len1, right - len1);
                    }
                } else {
                    if (arr1[left] > arr1[right]) {
                        swap(arr1, arr1, left, right);
                    }
                }
                left++;
                right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        method(A,B);
        method(A,C);
        method(B,C);
        ArrayList<Integer> arrayList = new ArrayList();
        for (int x :A)arrayList.add(x);
        for (int x :B)arrayList.add(x);
        for (int x :C)arrayList.add(x);
        return arrayList;
    }
    public static void main(String[] args) {

    }
}
