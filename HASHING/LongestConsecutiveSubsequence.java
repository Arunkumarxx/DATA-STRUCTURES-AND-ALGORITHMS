package HASHING;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        
    }
    private int method(int [] arr,char job) {
        int res=0;
        if(job=='+')
            for(int i=0; i< arr.length ;++i)
            res+=arr[i];
       else  if(job=='-')
            for(int i=0; i< arr.length ;++i)
                res+=arr[i];
       else if(job=='/')
            for(int i=0; i< arr.length ;++i)
                res/=arr[i];
       else if(job=='*')
            for(int i=0; i< arr.length ;++i)
                res*=arr[i];

            return res;
    }
}
