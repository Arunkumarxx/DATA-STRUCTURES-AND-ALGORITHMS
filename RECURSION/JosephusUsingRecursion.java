package RECURSION;
public class JosephusUsingRecursion {
    static void Josephus (int n,int k) {
        int arr[] =new int[n ];
        for (int i=1; i<=n; i++){
            arr[i-1] =i;
        }
        int i=0;
        JosephusUsingRecursion(arr,n,k,i);
    }
    static void JosephusUsingRecursion(int arr[],int n,int k,int i) {
        if (n==1){
            System.out.println(arr[0]);
            return;
            }
        i=(i+k-1)%n;
        leftShiftArray(i,arr);
        JosephusUsingRecursion(arr,n-1,k,i);
    }
    static void   leftShiftArray(int i, int arr[]) {
        for (;i< arr.length-1; i++){
            arr[i]=arr[i+1];
        }
    }
    static long  Josephus(long n,long k) {
        if (n==1)
            return 0;
        return  ((Josephus(n-1,k)+k)%n);
    }
    public static void main(String[] args) {
        int n=7;
        int k=3;
        Josephus(n,k);
        System.out.println(Josephus((long)n,k));
    }
}