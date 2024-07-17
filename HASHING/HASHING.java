package HASHING;


import java.util.Arrays;

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
        int sum=0;
        System.out.println();
        int startOne=0;
        int endOne=(n-2)/2;
        int startTwo=(n)/2;
        int endTwo=n-2;
            sum+=arr[n-1];
        System.out.println(startOne);
        System.out.println(endOne);
        System.out.println(startTwo);
        System.out.println(endTwo);

        int itr=0;
        while(startOne<endOne &&  startTwo<endTwo) {
            sum = sum+ arr[++startOne] + arr[--endOne] + arr[++startTwo] + arr[--endTwo];
            itr++;
        }
        System.out.println(startOne);
        System.out.println(endOne);
        System.out.println(startTwo);
        System.out.println(endTwo);
        if(startOne==endOne)
            sum+=arr[startOne];
        if(startTwo==endTwo)
            sum+=arr[startTwo];

        System.out.println(sum);

    }
}
