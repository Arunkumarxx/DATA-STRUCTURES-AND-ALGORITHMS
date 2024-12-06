package TREE;

public class DeleteWordInTrie
{
    private final int alphabetSize=26;
    private class TrieNode
    {
        TrieNode[] children = new TrieNode[alphabetSize];
        boolean isEnd=false;
    }
    private TrieNode root;
    private void insert(String word)
    {
        if(root==null)
            root = new TrieNode();
        int n=word.length();
        TrieNode temp =root;
         for(int i=0;i<n;++i)
         {
             char curr=word.charAt(i);
             int ind=curr-97;
             if(temp.children[ind]==null)
             {
                 
             }
         }
    }
    private void search(String word)
    {

    }
    public static void main(String[] args)
    {
        DeleteWordInTrie Trie =new DeleteWordInTrie();

    }

}
