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
        String string  ="AAAAAABCCCCCCDDEEEEE";
        int n=string.length();
        HuffManEncodingAlgorithm encodingAlgorithm =new HuffManEncodingAlgorithm();
        String  [] table=new String[52];
        System.out.println(encodingAlgorithm.enCodingString(string,n,table));
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
            if(Character.isLowerCase(root.value))
            {
                int ind=root.value-'a';
                table[ind]=code;
            }
            else
            {
                int ind=root.value-'A'+26;
                table[ind]=code;
            }
        }
        print(root.left,code+'0',table);
        print(root.right,code +'1',table);
    }
    protected String  enCodingString(String string,int n,String [] table)
    {
        for (int i = 0; i < n; ++i) {
            char c = string.charAt(i);

            if (Character.isLowerCase(c)) {
                freq[c - 'a']++;
            } else {
                freq[c - 'A' + 26]++;
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
        for (int i = 0; i < n; ++i) {
            char currentChar = string.charAt(i);
            if (Character.isLowerCase(currentChar))
            {
                int index = currentChar - 'a';
                String value = table[index];
                stringBuilder.append(value);
            }
            else
            {
                int index = currentChar - 'A' + 26;
                String value = table[index];
                stringBuilder.append(value);
            }
        }

        return stringBuilder.toString();
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
    public String decodeHuffmanData(Pair root, String binStr) {
        int n = binStr.length();
        StringBuilder result = new StringBuilder();
        Pair temp = root;

        for (int i = 0; i < n; ++i) {
            // Traverse left for '0' and right for '1'
            if (binStr.charAt(i) == '0') {
                temp = temp.left;
            } else {
                temp = temp.right;
            }

            // If we reach a leaf node, append the character to the result
            if (Character.isLetter(temp.value)) {
                result.append(temp.value);
                temp = root; // Reset to the root for the next character
            }
        }

        // Check if we ended at a leaf node after the loop
        if (Character.isLetter(temp.value)) {
            result.append(temp.value);
        }

        return result.toString();
    }
}
