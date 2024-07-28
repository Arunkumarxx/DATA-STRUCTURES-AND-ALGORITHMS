package HASHING;

public class LongestConsecutiveSubsequence extends Thread {
    int [] arr;
    int n;
    char c;
    LongestConsecutiveSubsequence(int [] arr,int n,char c) {
        this.arr=arr;
        this.n=n;
        this.c=c;
    }
    public void run() {
        System.out.println(method(arr,c));
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int n= arr.length;
        LongestConsecutiveSubsequence T1 =new LongestConsecutiveSubsequence(arr,n,'+');
        LongestConsecutiveSubsequence T2  =new LongestConsecutiveSubsequence(arr,n,'-');
        LongestConsecutiveSubsequence T3 =new LongestConsecutiveSubsequence(arr,n,'/');
        LongestConsecutiveSubsequence T4  =new LongestConsecutiveSubsequence(arr,n,'*');
        T1.run();
        T2.run();
    }
    private int method(int [] arr,char job) {
        int res=0;
        if(job=='+')
            for(int i=0; i< arr.length ;++i)
            res+=arr[i];
       else  if(job=='-')
            for(int i=0; i< arr.length ;++i)
                res-=arr[i];
       else if(job=='/')
            for(int i=0; i< arr.length ;++i)
                res/=arr[i];
       else if(job=='*')
            for(int i=0; i< arr.length ;++i)
                res*=arr[i];

            return res;
    }
}
