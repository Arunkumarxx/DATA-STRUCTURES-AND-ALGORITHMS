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
        int endOne=(n)/2;
        int startTwo= (int) Math.ceil((n+1)/2d);
        int endTwo=n-1;
        boolean isEndOneIsOdd=endOne%2==0?false:true;
        boolean isstartTwoIsOdd=endOne%2==0?false:true;
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
        if(isstartTwoIsOdd)
            sum+=arr[endOne];
        if(isEndOneIsOdd)
            sum+=arr[startTwo];

        System.out.println(sum);

    }
}
