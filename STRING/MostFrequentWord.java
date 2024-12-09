package STRING;
import java.util.*;
public class MostFrequentWord
{

    public String mostFrequentWord(String arr[],int n)
    {
        HashMap<String, Integer> frequencyMap=new HashMap<>();
        HashMap<String, Integer> firstOccurrenceIndexMap=new HashMap<>();
        String result="";
        int maxFrequency=0;
        for(int i=0;i<n;i++)
        {
            String word=arr[i];
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0)+1);
            firstOccurrenceIndexMap.putIfAbsent(word, i);
            int currentFreq=frequencyMap.get(word);
            if(currentFreq>maxFrequency||
                    (currentFreq==maxFrequency&&
                            firstOccurrenceIndexMap.get(word)>
                                    firstOccurrenceIndexMap.get(result)))
            {
                result=word;
                maxFrequency=currentFreq;
            }
        }
        return result;

    }

    public static void main(String[] args)
    {
        MostFrequentWord obj =new MostFrequentWord();
        String[] arr = {"xejdcj", "xejdcj", "lvjpb", "tmyuiu", "lvjpb", "tmyuiu",
                "ovoba", "lvjpb", "lvjpb", "fqhyu", "fqhyu", "tmyuiu",
                "xejdcj", "tmyuiu", "fqhyu", "ovoba", "xejdcj"};
        System.out.println(obj.mostFrequentWord(arr,arr.length));
    }
}
