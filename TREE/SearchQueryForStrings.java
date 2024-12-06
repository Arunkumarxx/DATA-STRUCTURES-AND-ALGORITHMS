package TREE;

public class SearchQueryForStrings
{
    private final int alphabetSize=52;
    private class TrieNode
    {
        TrieNode [] children;
        boolean isEndOfWord;
        TrieNode()
        {
            this.children =new TrieNode[alphabetSize];
        }
    }
    TrieNode root;

    public static void main(String[] args)
    {
        
    }

}
