package GREEDY;

public class HuffManAlgorithm
{

    public static void main(String[] args)
    {
        String string  ="AAAAAABCCCCCCDDEEEEE";

        HuffManEncodingAlgorithm encodingAlgorithm =new HuffManEncodingAlgorithm();
        encodingAlgorithm.enCodingString(string);
        HuffManDecodingAlgorithm decodingAlgorithm =new HuffManDecodingAlgorithm();

    }
}

class HuffManEncodingAlgorithm
{
    protected String enCodingString(String string)
    {
        
    }
}

class HuffManDecodingAlgorithm
{

}