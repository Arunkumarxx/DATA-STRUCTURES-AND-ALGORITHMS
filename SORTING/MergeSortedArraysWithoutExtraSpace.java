package SORTING;
class MergeSortedArraysWithoutExtraSpace {
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        }
        public static void main (String[]args){
            int arr1[] = {12, 42};
            int arr2[] = {3, 4, 5, 28, 37, 42, 43, 46};
            int lastPointer = arr1.length - 1;
            int firstPointer = 0;
            while (lastPointer >= 0 && firstPointer < arr2.length && arr1[lastPointer] > arr2[firstPointer]) {
                int temp = arr2[firstPointer];
                arr2[firstPointer] = arr1[lastPointer];
                arr1[lastPointer] = temp;
                lastPointer--;
                firstPointer++;
            }
            mergeSort(arr1, 0, arr1.length - 1);
            mergeSort(arr1, 0, arr1.length - 1);

        }
    }
