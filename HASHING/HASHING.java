package HASHING;


public class HASHING {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int n = arr.length;
        int res=0;
        int count=1;
        for (int i = 0; i < arr.length; ++i)
            arr[i]=count++;

        for (int i = 0; i < n; i++)
            res += arr[i];
        System.out.println(res);
        System.out.println();
        int startOne=0;
        int endOne=n/2;
        int startTwo=(n+1)/2;
        int endTwo=n-1;
        boolean isEndOneIsEven=endOne%2==0?true:false;
        boolean isstartTwoIsEven=endOne%2==0?true:false;
        System.out.println(startOne);
        System.out.println(endOne);
        System.out.println(startTwo);
        System.out.println(endTwo);
        int sum=0;
        int itr=0;
        while(startOne<endOne &&  startTwo<endTwo) {
            sum = sum+ arr[++startOne] + arr[--endOne] + arr[++startTwo] + arr[--endTwo];
            itr++;
        }
        if(isstartTwoIsEven)
        System.out.println(sum);

    }
}
