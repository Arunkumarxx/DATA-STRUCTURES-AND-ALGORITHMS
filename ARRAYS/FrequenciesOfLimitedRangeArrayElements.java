package ARRAYS;

import java.util.Arrays;

public class FrequenciesOfLimitedRangeArrayElements {

    public static void main(String[] args) {
        int n=5;
        int p=5;
        int []arr={2, 3, 2, 3, 5};

        int i=0;
        while (i<n)
        {
            if (arr[i]<=0||arr[i]>n||arr[i]>p)
            {
                i++;
                continue;
            }
            int element=arr[i]-1;

            if(arr[element]>0){
                arr[i]=arr[element];
                arr[element]=-1;
                }
            else {
                arr[element]--;
                arr[i]=0;
                i++;
            }
        }
        for (int j=0; j<n; j++){
            if (arr[j]<0)
                arr[j]=-arr[j];
        }
        for (int temp:arr)
            System.out.print(temp+" ");
    }
}
