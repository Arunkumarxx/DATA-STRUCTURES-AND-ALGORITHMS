package STRING;
import java.util.*;
public class MostFrequentWord
{
    HashMap<String,Integer> hashMap =new HashMap<>();
    StringBuilder result=new StringBuilder();
    int freq=0;
    public String mostFrequentWord(String arr[],int n)
    {
        mostFreqWord(arr,n,0);
        return result.toString();
    }
    public void mostFreqWord(String [] arr,int n,int ind)
    {
        if(ind==n)
            return;

        if(hashMap.containsKey(arr[ind]))
            hashMap.put(arr[ind],hashMap.get(arr[ind])+1);
        else hashMap.put(arr[ind],1);
        mostFreqWord(arr,n,ind+1);
        int newFreq=hashMap.get(arr[ind]);
        System.out.println(arr[ind]+newFreq);
        if(newFreq>freq)
        {
            result.setLength(0);
            result.append(arr[ind]);
            freq=newFreq;
        }
    }
    public static void main(String[] args)
    {
        MostFrequentWord obj =new MostFrequentWord();
        String [] arr ={"xejdcj","xejdcj"," lvjpb","tmyuiu","lvjpb","tmyuiu","ovoba","lvjpb","lvjpb","fqhyu","fqhyu","tmyuiu","xejdcj","tmyuiu"," fqhyu","ovoba","xejdcj"};
        System.out.println(obj.mostFrequentWord(arr,arr.length));
    }
}
