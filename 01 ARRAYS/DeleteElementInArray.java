package ARRAYS;
public class DeleteElementInArray {
    static int DeleteIndex(int arr[],int key){
        for (int i=0; i< arr.length;i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
    static int DeleteElements(int arr[],int key,int n) {
       int index= DeleteIndex(arr,key);
        if (index==-1)
            return n;
        else {
            for (int i=index;i<n-1;i++){
                arr[i]=arr[i+1];
            }
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[] = {3,8,12,5,6};
        int delKey=12;
        int n= arr.length;
        n=DeleteElements(arr,delKey ,n);
        for (int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
