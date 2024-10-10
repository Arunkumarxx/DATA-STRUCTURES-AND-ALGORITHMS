package RECURSION;
public class PrintingAllPermutations {
    static void PermutationsUsingRecursion(char arr[],int fi) {
        if (fi==arr.length-1) {
            System.out.print(arr);
            System.out.print(" ");
            return;
        }
        for (int i=fi; i< arr.length; i++){
            swap(arr,i,fi);
            PermutationsUsingRecursion(arr,fi+1);
            swap(arr,i,fi);
        }
    }
    static char  [] swap(char  arr[],int i,int fi) {
        char  temp=arr[fi];
        arr[fi]=arr[i];
        arr[i]=temp;
        return arr;
    }
    public static void main(String[] args) {
        char arr[] ={'A','B','C'};
        PermutationsUsingRecursion(arr,0);
    }
}