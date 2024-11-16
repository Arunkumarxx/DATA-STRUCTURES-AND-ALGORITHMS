package GREEDY;

import java.lang.reflect.Parameter;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffManAlgorithm
{

    public static void main(String[] args)
    {
        String string  ="AAAAAABCCCCCCDDEEEEE";
        int n=string.length();
        HuffManEncodingAlgorithm encodingAlgorithm =new HuffManEncodingAlgorithm();
        encodingAlgorithm.enCodingString(string,n);
        HuffManDecodingAlgorithm decodingAlgorithm =new HuffManDecodingAlgorithm();

    }
}

class HuffManEncodingAlgorithm
{
    int [] freq =new int[52];
    class Pair
    {
        char value;
        Pair left;
        Pair right;
        int freq;
        Pair(char value,int freq,Pair left,Pair right)
        {
            this.value=value;
            this.freq=freq;
            this.left=left;
            this.right=right;
        }
    }
    protected String enCodingString(String string,int n)
    {
        for(int i=0;i<n;++i)
        {
            int  ind=string.charAt(i);
            if(ind>=65 && ind<=90)
            {
                int pos=(ind-'A')+26;
                ++freq[pos];
             }
            else
            {
                ++freq[ind-'a'];
            }
        }
        PriorityQueue<Pair> minheap =new PriorityQueue<>(Comparator.comparing((a)->a.freq));
        for(int i=0;i<52;++i)
        {
            if(freq[i]!=0)
            {
                minheap.add(new Pair(intToChar(i),freq[i],null,null));
            }
        }
        while(minheap.size()!=0)
        {
            Pair pair1 =minheap.poll();
            Pair pair2 =minheap.poll();
            int freqSum=pair1.freq+pair2.freq;
            Pair newPair= new Pair('*',freqSum, pair1,pair2);
            minheap.add(newPair);
        }
        System.out.println(minheap.peek().freq);
        return "";
    }
    protected char intToChar(int i)
    {
        if(i<=25)
            return ((char)('a'+i));
        else return (char)('A'+(i-26));
    }
}

class HuffManDecodingAlgorithm
{

}