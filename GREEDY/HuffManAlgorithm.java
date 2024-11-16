package GREEDY;

import java.lang.reflect.Parameter;
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
        Pair(char value,int freq )
        {
            this.value=value;
            this.freq=freq;
            left=right=null;
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
        PriorityQueue<Pair> minheap =new PriorityQueue<>();
        for(int i=0;i<52;++i)
        {
            if(freq[i]!=0)
            {
                minheap.add(new Pair(intToChar(i),freq[i]));
            }
        }

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