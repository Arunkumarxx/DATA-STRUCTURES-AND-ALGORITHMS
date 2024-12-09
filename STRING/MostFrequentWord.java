package STRING;
import java.util.*;
public class MostFrequentWord
{

    public String mostFrequentWord(String arr[],int n)
    {
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> lastIndexMap = new HashMap<>();
        String result = "";
        int freq = 0;

        for (int i = 0; i < n; i++) {
            String word = arr[i];
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
            lastIndexMap.put(word, i);

            int currentFreq = hashMap.get(word);

            if (currentFreq > freq ||
                    (currentFreq == freq && lastIndexMap.get(word) > lastIndexMap.get(result))) {
                result = word;
                freq = currentFreq;
            }
        }

        return result;
    }


    public static void main(String[] args)
    {
        MostFrequentWord obj =new MostFrequentWord();
        String [] arr ={"xejdcj","xejdcj","lvjpb","tmyuiu","lvjpb","tmyuiu","ovoba","lvjpb","lvjpb","fqhyu","fqhyu","tmyuiu","xejdcj","tmyuiu","fqhyu","ovoba","xejdcj"};
        String [] arr2 ={"hello","world"};
        System.out.println(obj.mostFrequentWord(arr2,arr2.length));
        System.out.println(obj.mostFrequentWord(arr,arr.length));

    }
}
