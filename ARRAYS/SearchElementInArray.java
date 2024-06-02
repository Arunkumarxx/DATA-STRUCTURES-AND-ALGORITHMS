package ARRAYS;
public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[] = {20,5,7,25};
        short search=5;
        long n=arr.length;
        for (int i=0; i<n;i++)
        {
            if (arr[i]==search)
                System.out.print(i+1);
        }
    }
}
