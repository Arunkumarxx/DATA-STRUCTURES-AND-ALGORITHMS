package ARRAYS;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] ={1,2,0,3,0,0,3,4,5,6};
        int n= arr.length;
        int counter=0;
        for (int i=0; i< n;i++)
            if (arr[i]!=0)
                arr[counter++]=arr[i];
        while (counter<n)
            arr[counter++]=0;
        for (int x:arr){

        }

    }
}
