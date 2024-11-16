package GREEDY;


import java.util.Comparator;

import java.util.PriorityQueue;

class Pair
{
    char value;
    Pair left, right;
    int freq;
    Pair(char value,int freq,Pair left,Pair right)
    {
        this.value=value;
        this.freq=freq;
        this.left=left;
        this.right=right;
    }
}
public class HuffManAlgorithm
{

    public static void main(String[] args)
    {
        String string  ="ABRACADABRA";
        int n=string.length();
        HuffManEncodingAlgorithm encodingAlgorithm =new HuffManEncodingAlgorithm();
        String  [] table=new String[52];
         encodingAlgorithm.enCodingString(string,n,table);
        HuffManDecodingAlgorithm decodingAlgorithm =new HuffManDecodingAlgorithm();
    }
}


class HuffManEncodingAlgorithm
{
    int  [] freq =new int [52];
    protected void print(Pair root,String  code,String [] table)
    {
        if(root==null)
            return;
        if(Character.isLetter(root.value))
        {
            table[intToChar(root.value)]=code;
        }
        print(root.left,code+'0',table);
        print(root.right,code +'1',table);
    }
    protected String  enCodingString(String string,int n,String [] table)
    {
        for(int i=0;i<n;++i)
        {
            int  ind=string.charAt(i);
            if (ind >= 'a' && ind <= 'z')
            {
                int pos = ind - 'a';
                ++freq[pos];
            }
            else
            {
                int pos = (ind - 'A') + 26;
                ++freq[pos];
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
        while(minheap.size()>1)
        {
            Pair pair1 =minheap.poll();
            Pair pair2 =minheap.poll();
            int freqSum=pair1.freq+pair2.freq;
            Pair newPair= new Pair('*',freqSum, pair1,pair2);
            minheap.add(newPair);
        }
        print(minheap.poll(),"",table);
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0;i<n;++i)
        {
            if(Character.isLowerCase(string.charAt(i)))
            {
                String value=table['a'-i];
                System.out.println(stringBuilder.append(value));
            }
            else
            {
                
            }
        }
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