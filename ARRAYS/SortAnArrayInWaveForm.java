package ARRAYS;

import java.util.Arrays;

class SortAnArrayInWaveForm {
static void SortAnArrayInWaveForm1(int[] a,int n) {
// recommended Wave Array done by brute force with effcient
// code O(n) O(1)
int t;
for (int i =0 ; i<n && i+1 !=a.length ; i++){
if (i%2 == 0){
     if (a[i] < a[i+1]){
          t=a[i];
          a[i]=a[i+1];
          a[i+1]=t;
}
}
}
for (int temp:a){
System.out.print(temp+" ");
}
}
static void SortAnArrayInWaveForm2(int[] arr,int n) {
// brute force approach
//main problem
//O(n) O(n)
Arrays.sort(arr);
int[] array = new int[n];
int start = 0,end = n;
int largestn=n/2,smallest=0;
while (start <end){

     if (start%2 ==0 ){
          array[start++]=arr[largestn++];
     }
     else {
          if (start%2 ==1)
          array[start++]=arr[smallest++];
     }
}
for (int i=0; i<n; i++){
     System.out.print(array[i]+" ");
}

}
static void SortAnArrayInWaveForm3(int[] arr,int n) {
// brute force approach wave array
// failed---- brute force approach
     int t;
for (int i=0; i<n && i+1 != arr.length; i++){
if (i%2 == 1) {
    if (arr[i]>arr[i-1]){
         t=arr[i-1];
         arr[i-1]=arr[i];
         arr[i]=t;
    }

    if (arr[i] > arr[i + 1]) {
         t = arr[i];
         arr[i] = arr[i + 1];
         arr[i + 1] = t;

    }
    if (i==n-1){
         // to fix end it odd
         if (arr[i]>arr[i-1]){
            t=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=t;
         }
    }
}
}
for (int temp:arr){
System.out.print(temp+" ");
}

}
static void SortAnArrayInWaveForm4(int[] arr,int n) {
// brute  force approach  using swaping
    // when if i<i+1 largest < smallest
    //  break loop if it reached end of array in I+2 >= arr.length


        for (int i=0; i<n-1; i+=2){
            if (arr[i]<arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        for (int temp: arr){
            System.out.print(temp+" ");
        }
    }
    static void swap(int[] arr,int x,int y) {
        int t;
        t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
}
static void SortAnArrayInWaveForm5(int[] arr,int n) {

    int t;
    for (int i = 0; i < n - 1; i += 2) {
        if (i > 0 && arr[i] < arr[i - 1]) {
            swap2(arr, i - 1, i);
        }
        if (arr[i] < arr[i + 1]) {
            swap2(arr, i, i + 1);
        }
    }
    for (int temp : arr) {
        System.out.print(temp + " ");
    }
}
    static void swap2(int[] arr,int x,int y) {
        int t;
        t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }

public static void main(String[] args) {
int []arr  ={10, 90, 49, 2, 1, 5, 23};
//index based e  o   e  o  e  o    e
int n= arr.length;
SortAnArrayInWaveForm5(arr,n);
}
}
