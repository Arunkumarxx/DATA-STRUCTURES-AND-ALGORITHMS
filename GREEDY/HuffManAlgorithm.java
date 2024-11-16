package GREEDY;

import java.lang.reflect.Parameter;
import java.util.HashMap;

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
        Character character;
        int freq;
        Pair(Character character,int freq)
        {
            this.character=character;
            this.freq=freq;
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
        return "";
    }
}

class HuffManDecodingAlgorithm
{

}