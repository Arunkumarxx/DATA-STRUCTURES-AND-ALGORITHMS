package HASHING;

import java.util.HashMap;

public class CheckEqualArrays {

    public static void main(String[] args) {
        int [] arr1 = {1,2,5,4,0};
        int [] arr2 = {2,4,5,0,1};
        int n1= arr1.length;
        int n2= arr1.length;
        HashMap<Integer,Integer> Freq =new HashMap<>();
        int i=0, j=0;
        while(i<n1 && j<n2)
        {
            Freq.put(arr1[i],Freq.get(arr1[i])==null?1:Freq.get(arr1[i])+1);
            Freq.put(arr2[j],Freq.get(arr2[j])==null?1:Freq.get(arr2[j])+1);
            i++;
            j++;
        }
        while(i<n1)
            Freq.put(arr1[i],Freq.get(arr1[i])==null?1:Freq.get(arr1[i])+1);
        while (j<n2)
            Freq.put(arr2[j],Freq.get(arr2[j])==null?1:Freq.get(arr2[j])+1);

        System.out.println(Freq);
        for (int k=0; k<Freq.size(); k++)
        {
            if(Freq.get(k)!=2) {
                System.out.println("False");
                break;
            }
        }
        System.out.println("True");

    }
}
